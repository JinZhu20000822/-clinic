package cn.jinzhu.cli.prescription.controller.newl;

import cn.jinzhu.cli.common.response.RespBean;
import cn.jinzhu.cli.prescription.service.newl.DiagListService;
import cn.jinzhu.cli.prescription.service.newl.DiagMedlistService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "医嘱信息关联表newl_diag_medlist")
@RestController
@RequestMapping("/api/prescription/newl/diag")
public class DiagMedListController {

    @Autowired
    DiagMedlistService diagMedlistService;//医嘱信息关联表service
    @ApiOperation(value = "添加新开就诊处方。循环添加医嘱信息",notes = "添加诊断信息，医嘱id循环添加")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "diagIds", value = "诊断类型id数组", defaultValue = "0")

    })
    @PostMapping("/medlist")
    public RespBean insertDiagMedlist(Integer[] adviceIds, HttpServletRequest request){
//        CsrfToken _csrf=(CsrfToken)request.getAttribute("_csrf");
//        _csrf.getHeaderName();
//        _csrf.getToken();
//        _csrf.getParameterName();
       if(diagMedlistService.insertDiagMedlist(adviceIds)){
           return RespBean.ok("添加成功");
       }else{
           return RespBean.error("添加失败");
       }

    }
}
