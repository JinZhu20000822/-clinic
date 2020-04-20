package cn.jinzhu.cli.prescription.service.hos;

import cn.jinzhu.cli.prescription.entity.hos.PatienInfo;
import cn.jinzhu.cli.prescription.entity.hos.PreTemplate;
import cn.jinzhu.cli.prescription.mapper.hos.PatienInfoMapper;
import cn.jinzhu.cli.prescription.mapper.hos.PreTemplateMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*患者*/
@Service("preTemplateService")
public class PreTemplateService {

      @Resource
      PreTemplateMapper preTemplateMapper;//摸板表mapper
      /*查询西药摸板及摸板下的详情*/
      public List<PreTemplate> getAllPreTemplatesDrugInformations(String premiss, String tempName,Integer id){
            return preTemplateMapper.getAllPreTemplatesDrugInformations(premiss,tempName,id);
      }
      /*查询检查摸板及摸板下的详情*/
      public List<PreTemplate> getAllPreTemplatesItemExamines(String premiss, String tempName,Integer id){
            return preTemplateMapper.getAllPreTemplatesItemExamines(premiss,tempName,id);
      }
}
