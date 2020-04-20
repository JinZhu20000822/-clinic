package cn.jinzhu.cli.prescription.service.med;

import cn.jinzhu.cli.prescription.entity.med.MenCheck;
import cn.jinzhu.cli.prescription.entity.med.MenEast;
import cn.jinzhu.cli.prescription.mapper.med.MenCheckMapper;
import cn.jinzhu.cli.prescription.mapper.med.MenEastMapper;
import cn.jinzhu.cli.prescription.mapper.newl.NewDiagMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("menCheckService")
public class MenCheckService {
    @Resource
    MenCheckMapper menCheckMapper;//项目检查细名表Mapper
    @Resource
    NewDiagMapper newDiagMapper;//诊断和医嘱管联最大newdiagId
    //插入中药细名表,循环添加
    @Transactional
    public boolean insertMenCheck(List<MenCheck> menChecks){
              Integer newdiagId=newDiagMapper.getNewDiagCount();//诊断和医嘱管联最大newdiagId
        return  menCheckMapper.insertMenCheck(menChecks,newdiagId)==menChecks.size();
    }
}
