package cn.jinzhu.cli.prescription.mapper.hos;

import cn.jinzhu.cli.prescription.entity.hos.PatienInfo;
import cn.jinzhu.cli.prescription.entity.hos.PreTemplate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PreTemplateMapper {


    public List<PreTemplate> getAllPreTemplatesDrugInformations(@Param("premiss")String premiss,@Param("tempName") String tempName,@Param("id")Integer id);/*查询西药西药摸板及摸板下的详情*/
    public List<PreTemplate> getAllPreTemplatesItemExamines(@Param("premiss")String premiss,@Param("tempName") String tempName,@Param("id")Integer id);/*查询检查摸板及摸板下的详情*/
}
