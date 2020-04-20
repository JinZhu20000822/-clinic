package cn.jinzhu.cli.masterdata.service.hos;

import cn.jinzhu.cli.masterdata.entity.hos.Advice;
import cn.jinzhu.cli.masterdata.entity.hos.Department;
import cn.jinzhu.cli.masterdata.mapper.hos.AdviceMapper;
import cn.jinzhu.cli.masterdata.mapper.hos.DepartmentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*诊断*/
@Service("departmentService")
public class DepartmentService {

      @Resource
      DepartmentMapper departmentMapper;//科室表mapper

      /*查询所有诊断类型*/
      public List<Department> getAllDepartmentUserBydepId(Integer id) {
          return departmentMapper.getAllDepartmentUserBydepId(id);
      }

}
