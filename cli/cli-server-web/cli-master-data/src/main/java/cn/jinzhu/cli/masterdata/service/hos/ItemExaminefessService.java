package cn.jinzhu.cli.masterdata.service.hos;

import cn.jinzhu.cli.masterdata.entity.hos.ItemCate;
import cn.jinzhu.cli.masterdata.entity.hos.ItemExamine;
import cn.jinzhu.cli.masterdata.mapper.hos.ItemExamineMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*诊断*/
@Service("itemExaminefessService")
public class ItemExaminefessService {

      @Resource
      ItemExamineMapper itemExamineMapper;//医嘱表mapper

      /*查询所有附加费用类型*/
      public List<ItemExamine> getAllItemCateeItemExaminByItemCateeId(ItemCate itemCate,String name) {
          return itemExamineMapper.getAllItemCateeItemExaminByItemCateeId(itemCate,name);
      }

}
