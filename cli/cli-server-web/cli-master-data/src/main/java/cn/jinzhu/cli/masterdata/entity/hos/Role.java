package cn.jinzhu.cli.masterdata.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 角色信息
 */
@ApiModel(value = "role对象",description = "角色信息")
public class Role {

    @ApiModelProperty(value = "自增列",name = "id")
    private Integer id;
    @ApiModelProperty(value = "角色名",name = "name")
    private String name;
    @ApiModelProperty(value = "描述",name = "introdu")
    private String introdu;
    @ApiModelProperty(value = "创建日期",name = "createDate")
    private Date createDate;
    @ApiModelProperty(value = "状态",name = "status")
    private boolean status;
    @ApiModelProperty(value = "创建人",name = "createId")
    private User user;
    @ApiModelProperty(value = "编号",name = "number")
    private String number;

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

    public String getIntrodu() {
        return introdu;
    }

    public void setIntrodu(String introdu) {
        this.introdu = introdu;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
