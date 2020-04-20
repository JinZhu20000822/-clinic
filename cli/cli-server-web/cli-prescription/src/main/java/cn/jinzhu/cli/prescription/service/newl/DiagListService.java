package cn.jinzhu.cli.prescription.service.newl;

import cn.jinzhu.cli.prescription.mapper.newl.DiagListMapper;
import cn.jinzhu.cli.prescription.mapper.newl.NewDiagMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("diagListService")
public class DiagListService {
    @Resource
    DiagListMapper diagListMapper;//诊断信息关联表Mapper
    @Resource
    NewDiagMapper newDiagMapper;//诊断和医嘱管联最大newdiagId
    //插入诊断信息管理表,循环添加
    @Transactional
    public boolean insertDiagList(Integer[] diagId){
              Integer newdiagId=newDiagMapper.getNewDiagCount();//诊断和医嘱管联最大newdiagId
        return  diagListMapper.insertDiagList(diagId,newdiagId)==diagId.length;
    }
}
