package cn.jinzhu.cli.prescription.controller.newl;

import cn.jinzhu.cli.common.response.RespBean;
import cn.jinzhu.cli.prescription.service.newl.NewDiagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "新开就诊主表newl_diag")
@RestController
@RequestMapping("/api/prescription/newl/")
public class NewDiagController {

      @Autowired
      NewDiagService newDiagService;

    @PostMapping("/diag")
    @ApiOperation(value = "添加医嘱诊断患者关联表。最大表，新开就诊表",notes = "添加患者id和关联表最大id")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "patientId", value = "患者id", defaultValue = "0"),
            @ApiImplicitParam(name = "TypeName", value = "接诊类型", defaultValue = "复诊"),
            @ApiImplicitParam(name = "otherdiag", value = "其他诊断名称", defaultValue = "成龙大姨妈"),
            @ApiImplicitParam(name = "othermed", value = "其他医嘱名称", defaultValue = "多喝水")

    })
    public RespBean insertNewDiag( String TypeName,String otherdiag,String othermed, Integer patientId) {
       if(newDiagService.insertNewDiag(TypeName,otherdiag,othermed,patientId)==1){
           return RespBean.ok("添加成功");
       }else{
           return RespBean.error("添加失败");
       }

    }
}
