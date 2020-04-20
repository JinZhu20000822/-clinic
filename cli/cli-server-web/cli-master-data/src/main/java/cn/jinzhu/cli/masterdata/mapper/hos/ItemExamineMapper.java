package cn.jinzhu.cli.masterdata.mapper.hos;

import cn.jinzhu.cli.masterdata.entity.hos.Addfess;
import cn.jinzhu.cli.masterdata.entity.hos.ItemCate;
import cn.jinzhu.cli.masterdata.entity.hos.ItemExamine;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface ItemExamineMapper {

    public List<ItemExamine> getAllItemCateeItemExaminByItemCateeId(@Param("itemCate") ItemCate itemCate, @Param("name") String name);/*查询项目分类及项目信息类型*/

}
