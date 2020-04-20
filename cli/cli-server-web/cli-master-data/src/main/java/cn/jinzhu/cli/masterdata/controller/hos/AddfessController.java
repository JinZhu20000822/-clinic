package cn.jinzhu.cli.masterdata.controller.hos;

import cn.jinzhu.cli.masterdata.entity.hos.Addfess;
import cn.jinzhu.cli.masterdata.entity.hos.DiagInfo;
import cn.jinzhu.cli.masterdata.service.hos.AddfessService;
import cn.jinzhu.cli.masterdata.service.hos.DiagInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "附加费用类型表hos_addfess")
@RestController
@RequestMapping("/api/masterdata/hos")
public class AddfessController {
        @Autowired
        AddfessService addfessService;//诊断表service


        @ApiOperation(value = "查询所有附加费用类型",notes = "查询所有附加费用")
        @GetMapping("/addfess")
        public List<Addfess> getAllAddfess(){
            return addfessService.getAllAddfesse();
        }
    }

