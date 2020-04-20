package cn.jinzhu.cli.masterdata.controller.hos;

import cn.jinzhu.cli.masterdata.entity.hos.Advice;
import cn.jinzhu.cli.masterdata.service.hos.AdviceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "医嘱表hos_adivce")
@RestController
@RequestMapping("/api/masterdata/hos")
public class AdivceController {
    @Autowired
    AdviceService adviceService;//医嘱表service

    @ApiOperation(value = "查询医嘱类型",notes = "查询所有医嘱")
    @GetMapping("/adivce")
    public List<Advice> getAllAdivce(){
        return adviceService.getAllAdvice();
    }
}
