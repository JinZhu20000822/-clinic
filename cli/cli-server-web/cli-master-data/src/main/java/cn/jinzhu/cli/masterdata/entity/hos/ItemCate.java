package cn.jinzhu.cli.masterdata.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(value = "item_cate对象",description = "项目分类信息")
public class ItemCate {

    @ApiModelProperty(value = "项目分类主键id",name = "")
    private Integer id;
    @ApiModelProperty(value = "项目分类名称",name = "")
    private String name;
    @ApiModelProperty(value = "创建如期",name = "")
    private Date createDate;
    @ApiModelProperty(value = "创建人",name = "")
    private User user;
    @ApiModelProperty(value = "项目信息对象",name = "")
    private List<ItemExamine> itemExamine;

    public List<ItemExamine> getItemExamine() {
        return itemExamine;
    }

    public void setItemExamine(List<ItemExamine> itemExamine) {
        this.itemExamine = itemExamine;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
