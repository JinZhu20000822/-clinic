package cn.jinzhu.cli.masterdata.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "user_role对象",description = "用户角色关联表信息")
public class UserRole {

    @ApiModelProperty(value = "主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "用户id",name = "uid")
    private Integer uid;
    @ApiModelProperty(value = "角色id",name = "rid")
    private Integer rid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}
