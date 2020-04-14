package cn.jinzhu.cli.prescription.controller.hos;

import cn.jinzhu.cli.common.response.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "医嘱表hos_adivce")
@RestController
@RequestMapping("/hos")
public class AdivceController {


    @ApiOperation(value = "查询医嘱类型",notes = "查询所有医嘱") //注释方法
    @GetMapping("/adivce")
    public RespBean getByInfo(){
        return RespBean.ok("查询");
    }
}
