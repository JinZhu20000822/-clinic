package cn.jinzhu.cli.prescription.mapper.med;

import cn.jinzhu.cli.prescription.entity.med.MenEast;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenEastMapper {
    public int insertMenEastt(@Param("menEasts") List<MenEast> menEast, @Param("newdiagId") Integer newdiagId);//插入中药细名表,循环添加
}
