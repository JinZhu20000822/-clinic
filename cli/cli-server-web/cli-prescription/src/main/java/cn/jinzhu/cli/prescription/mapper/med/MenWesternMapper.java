package cn.jinzhu.cli.prescription.mapper.med;

import cn.jinzhu.cli.prescription.entity.med.MenEast;
import cn.jinzhu.cli.prescription.entity.med.MenWestern;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenWesternMapper {

    public int insertMenWestern(@Param("menWesterns") List<MenWestern> menWesterns, @Param("newdiagId") Integer newdiagId);//插入西药细名表,循环添加
}







