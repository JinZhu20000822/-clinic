package cn.jinzhu.cli.masterdata.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "addfess对象",description = "附加费用信息")
public class Addfess {

    @ApiModelProperty(value = "附加费用主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "附加费名称",name = "addiName")
    private String addiName;
    @ApiModelProperty(value = "状态",name = "addiStatus")
    private boolean addiStatus;
    @ApiModelProperty(value = "创建时间",name = "createDate")
    private Date createDate;
    @ApiModelProperty(value = "成本价",name = "cost")
    private float cost;
    @ApiModelProperty(value = "金额",name = "amount")
    private float amount;
    @ApiModelProperty(value = "创建人",name = "user")
    private User user;

    @ApiModelProperty(value = "处方id",name = "prescriTypeId")
    private int prescriTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddiName() {
        return addiName;
    }

    public void setAddiName(String addiName) {
        this.addiName = addiName;
    }

    public boolean isAddiStatus() {
        return addiStatus;
    }

    public void setAddiStatus(boolean addiStatus) {
        this.addiStatus = addiStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPrescriType() {
        return prescriTypeId;
    }

    public void setPrescriType(int prescriType) {
        this.prescriTypeId = prescriType;
    }
}
