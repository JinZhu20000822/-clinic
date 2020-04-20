package cn.jinzhu.cli.masterdata.controller.hos;

import cn.jinzhu.cli.masterdata.entity.hos.DiagInfo;
import cn.jinzhu.cli.masterdata.service.hos.DiagInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "诊断表hos_diag_info")
@RestController
@RequestMapping("/api/masterdata/hos/diag")
public class DiagInfoController {
        @Autowired
        DiagInfoService diagInfoService;//诊断表service


        @ApiOperation(value = "查询诊断类型",notes = "查询所有诊断")
        @GetMapping("/info")
        public List<DiagInfo> getAllDiagInfo(){
            return diagInfoService.getAllDiagInfo();
        }
//    @ApiImplicitParam(name="id",value = "用户id",required = true,defaultValue = "1")//对应方法参数
    }

