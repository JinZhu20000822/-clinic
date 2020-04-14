package cn.jinzhu.cli.prescription.controller.hos;

import cn.jinzhu.cli.common.response.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = "诊断表hos_diag_info")
@RestController
@RequestMapping("/hos/diag")
public class DiagInfoController {


        @ApiOperation(value = "查询诊断类型",notes = "查询所有诊断") //注释方法
        @GetMapping("/info")
        public RespBean getByInfo(){
            return RespBean.ok("查询");
        }
//    @ApiImplicitParam(name="id",value = "用户id",required = true,defaultValue = "1")//对应方法参数
    }

