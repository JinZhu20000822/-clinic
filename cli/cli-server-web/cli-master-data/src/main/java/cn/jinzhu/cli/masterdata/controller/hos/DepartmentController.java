package cn.jinzhu.cli.masterdata.controller.hos;

import cn.jinzhu.cli.masterdata.entity.hos.Department;
import cn.jinzhu.cli.masterdata.entity.hos.DiagInfo;
import cn.jinzhu.cli.masterdata.service.hos.DepartmentService;
import cn.jinzhu.cli.masterdata.service.hos.DiagInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "科室表hos_diag_info")
@RestController
@RequestMapping("/api/masterdata/hos")
public class DepartmentController {
        @Autowired
        DepartmentService departmentService;//科室表service


        @ApiOperation(value = "科室查询接口",notes = "查询所有科室和科室下面的员工")
        @GetMapping("/department")
        public List<Department> getAllDepartmentUserBydepId(Integer id){
            return departmentService.getAllDepartmentUserBydepId(id);
        }
//    @ApiImplicitParam(name="id",value = "用户id",required = true,defaultValue = "1")//对应方法参数
    }

