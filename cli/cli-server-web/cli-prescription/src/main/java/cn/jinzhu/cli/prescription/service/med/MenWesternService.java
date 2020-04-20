package cn.jinzhu.cli.prescription.service.med;



import cn.jinzhu.cli.prescription.entity.med.MenEast;
import cn.jinzhu.cli.prescription.entity.med.MenWestern;
import cn.jinzhu.cli.prescription.mapper.med.MenEastMapper;
import cn.jinzhu.cli.prescription.mapper.med.MenWesternMapper;
import cn.jinzhu.cli.prescription.mapper.newl.NewDiagMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

@Service("menWesternService")
public class MenWesternService {
    @Resource
    MenWesternMapper menWesternMapper;//西药细名表Mapper
    @Resource
    NewDiagMapper newDiagMapper;//诊断和医嘱管联最大newdiagId
    //插入中药细名表,循环添加
    @Transactional
    public boolean insertMenWestern(List<MenWestern> menWesterns){
              Integer newdiagId=newDiagMapper.getNewDiagCount();//诊断和医嘱管联最大newdiagId
        return  menWesternMapper.insertMenWestern(menWesterns,newdiagId)==menWesterns.size();
    }
}
