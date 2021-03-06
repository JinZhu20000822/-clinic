package cn.jinzhu.cli.common.response;

import lombok.Data;

@Data
public class RespBean {
    private Integer status;
    private String msg;
    private Object obj;
   public static RespBean build(){return  new RespBean();}
    public static RespBean ok(String msg) {
        return new RespBean(200, msg, null);
    }//成功

    public static RespBean ok(String msg, Object obj) {
        return new RespBean(200, msg, obj);
    }//成功带参数

    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }//失败

    public static RespBean error(String msg, Object obj) {
        return new RespBean(500, msg, obj);
    }//失败带参数

    public RespBean(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    public Integer getStatus() {
        return status;
    }
    private RespBean() {
    }
    public RespBean setStatus(Integer status) {
        this.status = status;
        return  this;
    }

    public String getMsg() {
        return msg;
    }

    public RespBean setMsg(String msg) {
        this.msg = msg;
        return  this;
    }

    public Object getObj() {
        return obj;
    }

    public RespBean setObj(Object obj) {
        this.obj = obj;
        return  this;
    }
//    private String code;
//    private long responseTime = System.currentTimeMillis();
//    private String message;
//    public RespBean(ResponseEnum responseEnum) {
//        this.code = responseEnum.getCode();
//        this.message = responseEnum.getMessage();
//    }


}
