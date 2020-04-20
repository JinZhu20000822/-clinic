package cn.jinzhu.cli.medicine.mapper.hos;

import cn.jinzhu.cli.medicine.entity.hos.DrugCate;
import cn.jinzhu.cli.medicine.entity.hos.PrescriType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugCateMapper {

    public List<DrugCate> getAllDrugCateByprescriTypeId(@Param("prescriType") PrescriType prescriType);//查询所有药品分类 根据处方类型id查询所有药品分类

}
