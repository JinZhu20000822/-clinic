package cn.jinzhu.cli.masterdata.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "item_util对象",description = "项目单位信息")
public class ItemUtil {

    @ApiModelProperty(value = "项目单位主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "项目单位名称",name = "name")
    private String name;
    @ApiModelProperty(value = "创建日期",name = "createDate")
    private Date createDate;
    @ApiModelProperty(value = "创建人",name = "user")
    private User user;

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
