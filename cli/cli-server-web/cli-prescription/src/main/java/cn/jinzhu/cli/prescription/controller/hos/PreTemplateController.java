package cn.jinzhu.cli.prescription.controller.hos;

import cn.jinzhu.cli.common.response.RespBean;
import cn.jinzhu.cli.common.response.Response;
import cn.jinzhu.cli.common.response.ResponseEnum;
import cn.jinzhu.cli.medicine.entity.hos.DrugCate;
import cn.jinzhu.cli.medicine.entity.hos.PrescriType;
import cn.jinzhu.cli.medicine.service.hos.DrugCateService;
import cn.jinzhu.cli.prescription.entity.hos.PreTemplate;
import cn.jinzhu.cli.prescription.service.hos.PreTemplateService;
import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "摸板表hos_pre_template")
@RestController
@RequestMapping("/api/prescription/hos/pre")
public class PreTemplateController {
    @Autowired
    PreTemplateService preTemplateService;//摸板表service
    @ApiOperation(value = "查询不同处方id查询摸板及摸板下的详情",notes = "查询所有药品类型")
    @GetMapping("/templat")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "premiss", value = "摸板权限名称" ),
            @ApiImplicitParam(name = "tempName", value = "摸板名称和编号"),
            @ApiImplicitParam(name = "id", value = "处方id", defaultValue = "0")
    })
    public   Map<String,List<PreTemplate>>  getAllPreTemplates(Integer id,String premiss,String tempName) throws UnsupportedEncodingException {
        Map<String,List<PreTemplate>> map=new HashMap<>();
        if(!StringUtils.isEmpty(premiss)) {
            URLEncoder.encode(premiss, "UTF-8");
        }
        if(!StringUtils.isEmpty(tempName)) {
            URLEncoder.encode(tempName, "UTF-8");
        }
         map.put("info", preTemplateService.getAllPreTemplatesDrugInformations(premiss,tempName,id));
         map.put("examine", preTemplateService.getAllPreTemplatesItemExamines(premiss,tempName,id));


//        if(id==3){
//            map.put("list", preTemplateService.getAllPreTemplatesMenCheck(premiss,tempName));
//        }
        return map;
    }

}
