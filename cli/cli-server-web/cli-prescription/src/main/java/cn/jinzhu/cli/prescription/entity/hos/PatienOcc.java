package cn.jinzhu.cli.prescription.entity.hos;

import cn.jinzhu.cli.masterdata.entity.hos.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "patien_occ对象",description = "患者职业信息")
public class PatienOcc {

    @ApiModelProperty(value = "职业主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "职业名称",name = "professName")
    private String professName;
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

    public String getProfessName() {
        return professName;
    }

    public void setProfessName(String professName) {
        this.professName = professName;
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
