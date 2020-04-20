package cn.jinzhu.cli.common.response;

import lombok.Data;

import java.util.List;

/**
 * 接口响应
 *
 */
@Data
public class Response {

  private String code;

  private String message;

  private long responseTime = System.currentTimeMillis();

  private Object responseBody;
  private List<Object> data;
  public Response() {
  }
  
  public Response(ResponseEnum responseEnum) {
    this.code = responseEnum.getCode();
    this.message = responseEnum.getMessage();
  }

  public Response setResponseBody(Object responseBody) {
    this.responseBody = responseBody;
    return this;
  }
  public Response list(List<Object> data) {
    this.data = data;
    return this;
  }
}
