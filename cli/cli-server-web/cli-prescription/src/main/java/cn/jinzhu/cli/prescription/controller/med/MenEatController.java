package cn.jinzhu.cli.prescription.controller.med;

import cn.jinzhu.cli.common.response.RespBean;
import cn.jinzhu.cli.prescription.entity.med.MenEast;
import cn.jinzhu.cli.prescription.service.med.MenEatService;
import cn.jinzhu.cli.prescription.service.newl.DiagListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api(tags = "中药细名关联表med_men_east")
@RestController
@RequestMapping("/api/prescription/med/men")
public class MenEatController {

    @Autowired
    MenEatService menEatService;//插入中药细名表,循环添加
    @ApiOperation(value = "插入中药细名表,",notes = "根据诊断id循环添加")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "List<MenEast> ", value = "中药细名对象数组", defaultValue = "0")

    })
    @PostMapping("/east")
    public RespBean insertMenEastt(@RequestBody List<MenEast> menEast){
       if(menEatService.insertMenEastt(menEast)){
           return RespBean.ok("添加成功");
       }else{
           return RespBean.error("添加失败");
       }

    }
}
