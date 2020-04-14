package cn.jinzhu.cli.prescription.controller;


import cn.jinzhu.cli.common.http.HttpClientHelper;
import cn.jinzhu.cli.common.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * api调用demo
 * @author Administrator
 *处方模块（新开就诊）
 */
@Api(tags = "第三方登录Oauthor调用")
@RestController
public class DemoController {
	@Value("${server.medicine.url}")
	private String serverMedicineUrl;
	@Autowired
	private HttpClientHelper httpClientHelper;

	@GetMapping("api/medicine/users")
	public Response getUsers() {
		return httpClientHelper.get(serverMedicineUrl + "/api/medicine/users");
	}

	@GetMapping("/login")
	public Response login() {
		return httpClientHelper.get(serverMedicineUrl + "/api/medicine/users");
	}
}
