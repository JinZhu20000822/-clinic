package cn.jinzhu.cli.common.http;

import cn.jinzhu.cli.common.response.RespBean;
import cn.jinzhu.cli.common.response.Response;
import cn.jinzhu.cli.common.response.ResponseEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONTokener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
@Slf4j
public class HttpClientHelper {
	@Autowired
	private HttpServletRequest request;
	public HttpClientHelper(HttpServletRequest request) {
		this.request = request;
	}

	private ObjectMapper objectMapper = new ObjectMapper();
	private Map<String, String> userObject = new HashMap<String, String>();
	/*对象*/
	public Response getForResponse(String uri) {
		CloseableHttpClient  httpClient = HttpClientBuilder.create().build();
		CloseableHttpResponse  response = null;
		System.out.println("进来");
		try {
			String ssoCookies = (String) request.getAttribute("ssoCookies");
			HttpGet httpGet = new HttpGet(uri);
			httpGet.addHeader("Cookie", ssoCookies);
			response = httpClient.execute(httpGet);
			HttpEntity httpEntity = response.getEntity();
			//授权过期,需要用户重新授权
			httpGet.addHeader("Content-Type", "application/json");/*获取的响应转换成json*/
			httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:75.0) Gecko/20100101 Firefox/75.0");
			Header contentType = (Header) response.headerIterator("Content-Type").next();
			if(contentType.getValue().startsWith("text/html")) {//请求授权页面
				return new Response(ResponseEnum.ERROR).setResponseBody("调用目标的授权已经失效，请先重新获取授权<a href='"+uri+"'>授权</a>"+ssoCookies);
			}
			String result = null;
			if(httpEntity != null) {
				result = EntityUtils.toString(httpEntity);
				System.out.println("获取数据"+result);
				if(response.getStatusLine().getStatusCode() == 200) {

					return objectMapper.readValue(result,Response.class);

				}
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			HttpClientUtils.closeQuietly(httpClient);
			HttpClientUtils.closeQuietly(response);
		}
		return new Response(ResponseEnum.ERROR).setResponseBody("出错了");
	}
	/*list*/
	public Response getlistResponse(String uri) {
		CloseableHttpClient  httpClient = HttpClientBuilder.create().build();
		CloseableHttpResponse  response = null;
		System.out.println("进来");
		try {
			String ssoCookies = (String) request.getAttribute("ssoCookies");
			HttpGet httpGet = new HttpGet(uri);
			httpGet.addHeader("Cookie", ssoCookies);
			response = httpClient.execute(httpGet);
			HttpEntity httpEntity = response.getEntity();
			//授权过期,需要用户重新授权
			httpGet.addHeader("Content-Type", "application/json");/*获取的响应转换成json*/
			httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:75.0) Gecko/20100101 Firefox/75.0");
			Header contentType = (Header) response.headerIterator("Content-Type").next();
			if(contentType.getValue().startsWith("text/html")) {//请求授权页面
				return new Response(ResponseEnum.ERROR).setResponseBody("调用目标的授权已经失效，请先重新获取授权<a href='"+uri+"'>授权</a>"+ssoCookies);
			}
			String result = null;
			if(httpEntity != null) {
				result = EntityUtils.toString(httpEntity);
				System.out.println("获取数据"+result);

				List<Object> list= JSONArray.parseArray(result,Object.class);
				if(response.getStatusLine().getStatusCode() == 200) {
						return new Response().list(list);
				}
			}
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			HttpClientUtils.closeQuietly(httpClient);
			HttpClientUtils.closeQuietly(response);
		}
		return new Response(ResponseEnum.ERROR).setResponseBody("出错了");
	}

	/**
	 * 访问单点登录的其他模块的api
	 * @param uri
	 * @return
	 */
	/*对象*/
	public Response postForResponse(String uri, Map<String, Object> params) {
		CloseableHttpClient  httpClient = HttpClientBuilder.create().build();
		CloseableHttpResponse  response = null;
		try {
			String ssoCookies = (String) request.getAttribute("ssoCookies");
			HttpPost httpPost = new HttpPost(uri);
			httpPost.addHeader("Cookie", ssoCookies);
			//

			List<NameValuePair> nameValuePairs = new ArrayList<>();
			params.forEach((k,v) -> {
				if(v != null) {
					nameValuePairs.add(new BasicNameValuePair(k, v.toString()));
				}
			});
//			httpPost.addHeader("Content-Type", "application/json");/*获取的响应转换成json*/
			httpPost.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:75.0) Gecko/20100101 Firefox/75.0");
			httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			response = httpClient.execute(httpPost);
			HttpEntity httpEntity = response.getEntity();
			//授权过期,需要用户重新授权
			Header contentType = (Header) response.headerIterator("Content-Type").next();
			if(contentType.getValue().startsWith("text/html")) {//请求授权页面
				return new Response(ResponseEnum.ERROR).setResponseBody("调用目标的授权已经失效，请先重新获取授权<a href='"+uri+"'>授权</a>");
			}
			String result = null;
			if(httpEntity != null) {
				result = EntityUtils.toString(httpEntity);

				if(response.getStatusLine().getStatusCode() == 200) {
					return objectMapper.readValue(result,Response.class);
				}
			}
		} catch(Exception ex) {
			System.out.println("出现错误"+ex);
		} finally {
			HttpClientUtils.closeQuietly(httpClient);
			HttpClientUtils.closeQuietly(response);
		}
		return new Response(ResponseEnum.ERROR).setResponseBody("出错了");
	}
	/**
	 * 普通http请求
	 * @param uri
	 * @return
	 */
	public String get(String uri) {
		CloseableHttpClient  httpClient = HttpClientBuilder.create().build();
		CloseableHttpResponse  response = null;
		String result = null;
		try {
			HttpGet httpGet = new HttpGet(uri);
			response = httpClient.execute(httpGet);
			result = EntityUtils.toString(response.getEntity());
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			HttpClientUtils.closeQuietly(httpClient);
			HttpClientUtils.closeQuietly(response);
		}
		return result;
	}
	/**
	 * 普通http请求
	 * @param uri
	 * @return
	 */
	public String post(String uri) {
		CloseableHttpClient  httpClient = HttpClientBuilder.create().build();
		CloseableHttpResponse  response = null;
		String result = null;
		try {
			HttpPost httpPost = new HttpPost(uri);
			response = httpClient.execute(httpPost);
			result = EntityUtils.toString(response.getEntity());
		} catch(Exception ex) {
			System.out.println(ex);
		} finally {
			HttpClientUtils.closeQuietly(httpClient);
			HttpClientUtils.closeQuietly(response);
		}
		return result;
	}
}
