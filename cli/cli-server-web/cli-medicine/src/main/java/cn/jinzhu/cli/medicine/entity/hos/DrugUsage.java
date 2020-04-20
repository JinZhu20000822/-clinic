package cn.jinzhu.cli.medicine.entity.hos;

import cn.jinzhu.cli.masterdata.entity.hos.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "drug_usage对象",description = "药品用法信息")
public class DrugUsage {

    @ApiModelProperty(value = "药品用法主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "药品用法名称",name = "name")
    private String name;
    @ApiModelProperty(value = "创建日期",name = "createDate")
    private Date createDate;
    @ApiModelProperty(value = "创建人",name = "createId")
    private User user;

    @ApiModelProperty(value = "处方类型对象",name = "prescriType")
    private PrescriType prescriType;

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

    public PrescriType getPrescriType() {
        return prescriType;
    }

    public void setPrescriType(PrescriType prescriType) {
        this.prescriType = prescriType;
    }
}
