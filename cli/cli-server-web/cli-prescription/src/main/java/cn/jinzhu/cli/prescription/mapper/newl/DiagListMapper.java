package cn.jinzhu.cli.prescription.mapper.newl;

import cn.jinzhu.cli.prescription.entity.newl.DiagMedlist;
import org.apache.ibatis.annotations.Param;

public interface DiagListMapper {
    public int insertDiagList(@Param("diagIds")Integer[] diagId,@Param("newdiagId")Integer newdiagId);//插入诊断信息管理表,循环添加
}
