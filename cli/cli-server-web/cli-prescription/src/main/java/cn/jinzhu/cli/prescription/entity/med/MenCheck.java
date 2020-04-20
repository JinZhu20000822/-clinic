package cn.jinzhu.cli.prescription.entity.med;


import cn.jinzhu.cli.masterdata.entity.hos.ItemCate;
import cn.jinzhu.cli.masterdata.entity.hos.ItemExamine;
import cn.jinzhu.cli.medicine.entity.hos.DrugUsage;
import cn.jinzhu.cli.prescription.entity.newl.NewDiag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "med_men_check对象",description = "检查项目")
public class MenCheck {

    @ApiModelProperty(value = "检查项目主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "数量",name = "quantity")
    private String quantity;
    @ApiModelProperty(value = "金额",name = "amount")
    private float amount;
    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;
    @ApiModelProperty(value = "总价",name = "total")
    private float total;
    @ApiModelProperty(value = "单价",name = "price")
    private float price;





    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @ApiModelProperty(value = "检查项目配置对象",name = "itemExamine")
    private ItemExamine itemExamine;
    @ApiModelProperty(value = "检查配置分类用法",name = "itemCate")
    private ItemCate itemCate;
    @ApiModelProperty(value = "新开就诊对象",name = "newDiag")
    private NewDiag newDiag;
    private Integer mobanid;
    @ApiModelProperty(value = "摸板下的项目信息名称",name = "name")
    private String name;
    @ApiModelProperty(value = "创建摸板下的项目信息单用法",name = "drugName")
    private String drugName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Integer getMobanid() {
        return mobanid;
    }

    public void setMobanid(Integer mobanid) {
        this.mobanid = mobanid;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ItemExamine getItemExamine() {
        return itemExamine;
    }

    public void setItemExamine(ItemExamine itemExamine) {
        this.itemExamine = itemExamine;
    }

    public ItemCate getItemCate() {
        return itemCate;
    }

    public void setItemCate(ItemCate itemCate) {
        this.itemCate = itemCate;
    }

    public NewDiag getNewDiag() {
        return newDiag;
    }

    public void setNewDiag(NewDiag newDiag) {
        this.newDiag = newDiag;
    }
}
