package cn.jinzhu.cli.medicine.mapper.hos;

import cn.jinzhu.cli.medicine.entity.hos.DrugInformation;
import cn.jinzhu.cli.medicine.entity.hos.PrescriType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugInformationMapper {
    //通过处方id查询每个药品分类下面的药品
    public List<DrugInformation> getDrugInformationByPrescriTypeId(@Param("prescriType") PrescriType prescriType,@Param("commonName") String commonName,@Param("pinyin")String pinyin,@Param("drugId")Integer drugId);
}
