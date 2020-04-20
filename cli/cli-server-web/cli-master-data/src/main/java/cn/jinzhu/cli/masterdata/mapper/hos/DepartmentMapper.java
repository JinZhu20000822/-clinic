package cn.jinzhu.cli.masterdata.mapper.hos;

import cn.jinzhu.cli.masterdata.entity.hos.Department;
import cn.jinzhu.cli.masterdata.entity.hos.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {

    public List<Department> getAllDepartmentUserBydepId(@Param("id") Integer id);/*查询所有科室和科室下的员工*/

}
