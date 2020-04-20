package cn.jinzhu.cli.masterdata.controller.hos;

import cn.jinzhu.cli.common.response.Response;
import cn.jinzhu.cli.common.response.ResponseEnum;
import cn.jinzhu.cli.common.utils.PageHelpers;
import cn.jinzhu.cli.masterdata.entity.hos.ItemCate;
import cn.jinzhu.cli.masterdata.entity.hos.ItemExamine;
import cn.jinzhu.cli.masterdata.service.hos.ItemExaminefessService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "项目分类表hos_item_cate")
@RestController
@RequestMapping("/api/masterdata/hos/item")
public class ItemExamineController {
    @Autowired
    ItemExaminefessService itemExaminefessService;//项目信息service
    @ApiOperation(value = "根据项目类别id查询项目信息",notes = "查询所有项目信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "每页显示数", required = true, defaultValue = "3"),
            @ApiImplicitParam(name = "id", value = "项目类型实体类id", required = true, defaultValue = "0"),
            @ApiImplicitParam(value = "项目名称和拼音",name = "name",defaultValue = ""),
    })
    @GetMapping("/examine")
    public Response getAllItemCateeItemExaminByItemCateeId(Integer pageNum, Integer pageSize, ItemCate itemCate,String name){
        PageHelpers.startPage(pageNum,pageSize);
        List<ItemExamine> list=itemExaminefessService.getAllItemCateeItemExaminByItemCateeId(itemCate,name);
        PageInfo<ItemExamine>pageInfo = new PageInfo<>(list);
        return  new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
}
