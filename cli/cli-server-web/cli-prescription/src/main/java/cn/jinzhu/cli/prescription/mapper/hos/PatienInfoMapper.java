package cn.jinzhu.cli.prescription.mapper.hos;

import cn.jinzhu.cli.prescription.entity.hos.PatienInfo;

import java.util.List;

public interface PatienInfoMapper {

    public List<PatienInfo> getAllPatienInfo();/*查询所有患者二表包过会员表*/
    public int insertPatienInfo();/*添加患者，添加的时候判断是否是复诊或初诊*/
}
