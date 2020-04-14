package cn.jinzhu.cli.prescription.controller.newl;

import cn.jinzhu.cli.common.response.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "接诊表newl_diag")
@RestController
@RequestMapping("/newl")
public class DiagController {


    @ApiOperation(value = "查询接诊",notes = "查询所有接诊") //注释方法
    @GetMapping("/diag")
    public RespBean getByInfo(){
        return RespBean.ok("查询");
    }
//    @ApiImplicitParam(name="id",value = "用户id",required = true,defaultValue = "1")//对应方法参数
}
