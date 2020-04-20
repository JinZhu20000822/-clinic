package cn.jinzhu.cli.medicine.service.hos;

import cn.jinzhu.cli.medicine.entity.hos.DrugInformation;
import cn.jinzhu.cli.medicine.entity.hos.PrescriType;
import cn.jinzhu.cli.medicine.mapper.hos.DrugInformationMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("drugInformationService")
public class DrugInformationService {
    @Resource
    DrugInformationMapper drugInformationMapper;
    //通过处方id查询每个药品分类下面的药品
    public List<DrugInformation> getDrugInformationByPrescriTypeId( PrescriType prescriType,String commonName,String pinyin,Integer drugId){
     return  drugInformationMapper.getDrugInformationByPrescriTypeId(prescriType,commonName,pinyin,drugId);
    }
}
