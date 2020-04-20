package cn.jinzhu.cli.prescription.controller.med;

import cn.jinzhu.cli.common.response.RespBean;
import cn.jinzhu.cli.prescription.entity.med.MenEast;
import cn.jinzhu.cli.prescription.entity.med.MenWestern;
import cn.jinzhu.cli.prescription.service.med.MenEatService;
import cn.jinzhu.cli.prescription.service.med.MenWesternService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "西药细名关联表med_men_western")
@RestController
@RequestMapping("/api/prescription/med/men")
public class MenWesternController {

    @Autowired
    MenWesternService menWesternService;//插入西药细名表,循环添加
    @ApiOperation(value = "插入西药细名表,",notes = "根据诊断id循环添加")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "List<MenWestern>", value = "中药细名对象数组", defaultValue = "0")

    })
    @PostMapping("/western")
    public RespBean insertMenWestern(@RequestBody List<MenWestern> menWesterns){
       if(menWesternService.insertMenWestern(menWesterns)){
           return RespBean.ok("添加成功");
       }else{
           return RespBean.error("添加失败");
       }

    }
}
