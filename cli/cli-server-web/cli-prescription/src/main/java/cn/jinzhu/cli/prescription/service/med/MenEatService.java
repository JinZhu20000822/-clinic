package cn.jinzhu.cli.prescription.service.med;

import cn.jinzhu.cli.prescription.entity.med.MenEast;
import cn.jinzhu.cli.prescription.mapper.med.MenEastMapper;
import cn.jinzhu.cli.prescription.mapper.newl.DiagListMapper;
import cn.jinzhu.cli.prescription.mapper.newl.NewDiagMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("menEatService")
public class MenEatService {
    @Resource
    MenEastMapper menEastMapper;//中药细名表Mapper
    @Resource
    NewDiagMapper newDiagMapper;//诊断和医嘱管联最大newdiagId
    //插入中药细名表,循环添加
    @Transactional
    public boolean insertMenEastt( List<MenEast> menEast){
              Integer newdiagId=newDiagMapper.getNewDiagCount();//诊断和医嘱管联最大newdiagId
        return  menEastMapper.insertMenEastt(menEast,newdiagId)==menEast.size();
    }
}
