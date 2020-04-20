package cn.jinzhu.cli.medicine.entity.hos;

import cn.jinzhu.cli.masterdata.entity.hos.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(value = "drug_cate对象",description = "药品分类信息")
public class DrugCate {

    @ApiModelProperty(value = "药品分类表主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "药品分类名称",name = "cateName")
    private String cateName;
    @ApiModelProperty(value = "创建时间",name = "createDate")
    private Date createDate;
    @ApiModelProperty(value = "创建人",name = "createId")
    private User user;
    @ApiModelProperty(value = "药品信息对象",name = "drugInformation")
    private List<DrugInformation> drugInformation;

    public List<DrugInformation> getDrugInformation() {
        return drugInformation;
    }

    public void setDrugInformation(List<DrugInformation> drugInformation) {
        this.drugInformation = drugInformation;
    }

    @ApiModelProperty(value = "处方类型对象",name = "prescriType")
    private PrescriType prescriType;

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
