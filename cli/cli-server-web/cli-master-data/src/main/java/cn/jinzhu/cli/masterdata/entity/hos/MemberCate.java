package cn.jinzhu.cli.masterdata.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "member_cate对象",description = "会员类型信息")
public class MemberCate {

    @ApiModelProperty(value = "会员信息主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "会员名称",name = "cateName")
    private String cateName;
    @ApiModelProperty(value = "创建日期",name = "createDate")
    private Date createDate;
    @ApiModelProperty(value = "折扣",name = "discount")
    private float discount;
    @ApiModelProperty(value = "最低积分",name = "lowIntegral")
    private float lowIntegral;
    @ApiModelProperty(value = "升级所需积分",name = "needIntegral")
    private float needIntegral;
    @ApiModelProperty(value = "状态",name = "status")
    private boolean status;
    @ApiModelProperty(value = "等级",name = "level")
    private String level;
    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;
    @ApiModelProperty(value = "创建人",name = "user")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getLowIntegral() {
        return lowIntegral;
    }

    public void setLowIntegral(float lowIntegral) {
        this.lowIntegral = lowIntegral;
    }

    public float getNeedIntegral() {
        return needIntegral;
    }

    public void setNeedIntegral(float needIntegral) {
        this.needIntegral = needIntegral;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
