package cn.jinzhu.cli.prescription.mapper.med;

import cn.jinzhu.cli.prescription.entity.med.MenCheck;
import cn.jinzhu.cli.prescription.entity.med.MenWestern;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenCheckMapper {

    public int insertMenCheck(@Param("menChecks") List<MenCheck> menChecks, @Param("newdiagId") Integer newdiagId);//插入项目检查细名表,循环添加
}
