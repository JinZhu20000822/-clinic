package cn.jinzhu.cli.medicine.service.hos;

import cn.jinzhu.cli.medicine.entity.hos.DrugCate;
import cn.jinzhu.cli.medicine.entity.hos.PrescriType;
import cn.jinzhu.cli.medicine.mapper.hos.DrugCateMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("drugCateService")
public class DrugCateService {
    @Resource
    DrugCateMapper drugCateMapper; //药品分类mapper

    //药品分类 根据处方类型id查询所有药品分类
    public List<DrugCate> getAllDrugCateByprescriTypeId(PrescriType prescriType){
        return  drugCateMapper.getAllDrugCateByprescriTypeId(prescriType);
    }

}
