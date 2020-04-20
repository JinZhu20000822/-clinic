package cn.jinzhu.cli.prescription.service.newl;

import cn.jinzhu.cli.prescription.mapper.newl.DiagMedlistMapper;
import cn.jinzhu.cli.prescription.mapper.newl.NewDiagMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("diagMedlistService")
public class DiagMedlistService {

     @Resource
    DiagMedlistMapper diagMedlistMapper;//医嘱患者关联
    @Resource
    NewDiagMapper newDiagMapper;//诊断和医嘱管联最大newdiagId
    //插入医嘱信息管理表,循环添加
    @Transactional
    public boolean insertDiagMedlist(Integer[] diagId){
        Integer newdiagId=newDiagMapper.getNewDiagCount();//诊断和医嘱管联最大newdiagId
        return  diagMedlistMapper.insertDiagMedlist(diagId,newdiagId)==diagId.length;
    }
}
