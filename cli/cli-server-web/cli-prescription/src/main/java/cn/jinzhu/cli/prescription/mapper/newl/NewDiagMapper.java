package cn.jinzhu.cli.prescription.mapper.newl;

import org.apache.ibatis.annotations.Param;

public interface NewDiagMapper {


    public int getNewDiagCount();//插入诊断信息和医嘱信息最大id
    public int insertNewDiag(@Param("typeName")String TypeName,
                             @Param("otherdiag")String otherdiag,@Param("othermed")String othermed,
                             @Param("patientId")Integer patientId
                            );/*添加医嘱诊断患者关联表。最大表，新开就诊表*/

}
