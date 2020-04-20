package cn.jinzhu.cli.prescription.controller.hos;

import cn.jinzhu.cli.common.response.RespBean;
import cn.jinzhu.cli.prescription.entity.hos.PatienInfo;
import cn.jinzhu.cli.prescription.service.hos.PatienInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "患者表hos_patien_info")
@RestController
@RequestMapping("/api/prescription/hos/patien")
public class PatienInfoController {
    @Autowired
    PatienInfoService patienInfoService;//患者表service

    @ApiOperation(value = "查询患者",notes = "查询所有患者")
    @GetMapping("/info")
    public List<PatienInfo> getByInfo() {
        return  patienInfoService.getAllPatienInfo();
    }
//    @ApiImplicitParam(name="id",value = "用户id",required = true,defaultValue = "1")//对应方法参数
}
