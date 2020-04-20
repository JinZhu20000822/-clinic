package cn.jinzhu.cli.prescription.controller.newl;

import cn.jinzhu.cli.common.response.RespBean;
import cn.jinzhu.cli.prescription.service.newl.DiagListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "诊断信息关联表newl_diag_list")
@RestController
@RequestMapping("/api/prescription/newl/diag")
public class DiagListController {

    @Autowired
    DiagListService diagListService;//诊断信息关联表
    @ApiOperation(value = "添加新开就诊处方。循环添加诊断信息",notes = "添加诊断信息，诊断id循环添加")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "diagIds", value = "诊断类型id数组", defaultValue = "0")

    })
    @PostMapping("/list")
    public RespBean insertDiagList(Integer[] diagIds, HttpServletRequest request){

       if(diagListService.insertDiagList(diagIds)){
           return RespBean.ok("添加成功");
       }else{
           return RespBean.error("添加失败");
       }

    }
}
