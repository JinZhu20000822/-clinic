package cn.jinzhu.cli.prescription.mapper.newl;

import org.apache.ibatis.annotations.Param;

public interface DiagMedlistMapper {
    public int insertDiagMedlist(@Param("adviceIds") Integer[] diagId, @Param("newdiagId") Integer newdiagId);//插入医嘱信息管理表,循环添加
}
