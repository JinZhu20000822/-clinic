package cn.jinzhu.cli.medicine.entity.hos;

import cn.jinzhu.cli.masterdata.entity.hos.Factory;
import cn.jinzhu.cli.masterdata.entity.hos.InvoiceItem;
import cn.jinzhu.cli.masterdata.entity.hos.PackUtil;
import cn.jinzhu.cli.masterdata.entity.hos.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(value = "drug_information对象",description = "药品信息")
public class DrugInformation {

    @ApiModelProperty(value = "药品信息主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "药品编号",name = "number")
    private String number;
    @ApiModelProperty(value = "药品条形码",name = "barCode")
    private String barCode;
    @ApiModelProperty(value = "药品通用名",name = "commonName")
    private String commonName;
    @ApiModelProperty(value = "拼音码",name = "pinyin")
    private String pinyin;
    @ApiModelProperty(value = "药品状态",name = "status")
    private boolean status;
    @ApiModelProperty(value = "药品规格",name = "standard")
    private String standard;
    @ApiModelProperty(value = "收费类型",name = "drugCate")
    private String drugCate;
    @ApiModelProperty(value = "采购价",name = "purchPrice")
    private float purchPrice;
    @ApiModelProperty(value = "售药价",name = "sellPrice")
    private float sellPrice;
    @ApiModelProperty(value = "创建时间",name = "createDate")
    private Date createDate;
    @ApiModelProperty(value = "是否是otc药品",name = "octDrug")
    private boolean octDrug;
    @ApiModelProperty(value = "批准文号",name = "approvalNumber")
    private String approvalNumber;
    @ApiModelProperty(value = "基本系数",name = "basicCoef")
    private Integer basicCoef;
    @ApiModelProperty(value = "剂量系数",name = "doseCoef")
    private Integer doseCoef;
    @ApiModelProperty(value = "允许拆零",name = "allowSplit")
    private boolean allowSplit;
    @ApiModelProperty(value = "单次用量",name = "singleUsage")
    private float singleUsage;
    @ApiModelProperty(value = "频度",name = "frequency")
    private String frequency;
    @ApiModelProperty(value = "天数",name = "day")
    private String day;
    @ApiModelProperty(value = "总价",name = "total")
    private float total;
    @ApiModelProperty(value = "库存上限",name = "invenHigh")
    private float invenHigh;
    @ApiModelProperty(value = "库存下限",name = "invenDown")
    private float invenDown;
    @ApiModelProperty(value = "货拉号",name = "cargoPull")
    private float cargoPull;
    @ApiModelProperty(value = "有效期预警",name = "earlyWarn")
    private float earlyWarn;
    @ApiModelProperty(value = "说明",name = "explanation")
    private String explanation;
    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;
    @ApiModelProperty(value = "创建人",name = "user")
    private User user;



    @ApiModelProperty(value = "药品分类对象",name = "cate")
    private DrugCate cate;
    @ApiModelProperty(value = "剂型对象",name = "dosage")
    private DrugDosage dosage;
    @ApiModelProperty(value = "发票项目对象",name = "invoiceItem")
    private InvoiceItem invoiceItem;
    @ApiModelProperty(value = "生产厂家对象",name = "factory")
    private Factory factory;
    @ApiModelProperty(value = "包装单位对象",name = "packUtil")
    private PackUtil packUtil;
    @ApiModelProperty(value = "基本单位对象",name = "basicUtil")
    private PackUtil basicUtil;
    @ApiModelProperty(value = "剂量单位对象",name = "dosageUtil")
    private PackUtil dosageUtil;
    @ApiModelProperty(value = "药品用法对象",name = "usage")
    private DrugUsage usage;

    public DrugUsage getUsage() {
        return usage;
    }

    public void setUsage(DrugUsage usage) {
        this.usage = usage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getDrugCate() {
        return drugCate;
    }

    public void setDrugCate(String drugCate) {
        this.drugCate = drugCate;
    }

    public float getPurchPrice() {
        return purchPrice;
    }

    public void setPurchPrice(float purchPrice) {
        this.purchPrice = purchPrice;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isOctDrug() {
        return octDrug;
    }

    public void setOctDrug(boolean octDrug) {
        this.octDrug = octDrug;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public Integer getBasicCoef() {
        return basicCoef;
    }

    public void setBasicCoef(Integer basicCoef) {
        this.basicCoef = basicCoef;
    }

    public Integer getDoseCoef() {
        return doseCoef;
    }

    public void setDoseCoef(Integer doseCoef) {
        this.doseCoef = doseCoef;
    }

    public boolean isAllowSplit() {
        return allowSplit;
    }

    public void setAllowSplit(boolean allowSplit) {
        this.allowSplit = allowSplit;
    }

    public float getSingleUsage() {
        return singleUsage;
    }

    public void setSingleUsage(float singleUsage) {
        this.singleUsage = singleUsage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getInvenHigh() {
        return invenHigh;
    }

    public void setInvenHigh(float invenHigh) {
        this.invenHigh = invenHigh;
    }

    public float getInvenDown() {
        return invenDown;
    }

    public void setInvenDown(float invenDown) {
        this.invenDown = invenDown;
    }

    public float getCargoPull() {
        return cargoPull;
    }

    public void setCargoPull(float cargoPull) {
        this.cargoPull = cargoPull;
    }

    public float getEarlyWarn() {
        return earlyWarn;
    }

    public void setEarlyWarn(float earlyWarn) {
        this.earlyWarn = earlyWarn;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
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

    public DrugCate getCate() {
        return cate;
    }

    public void setCate(DrugCate cate) {
        this.cate = cate;
    }

    public DrugDosage getDosage() {
        return dosage;
    }

    public void setDosage(DrugDosage dosage) {
        this.dosage = dosage;
    }

    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public PackUtil getPackUtil() {
        return packUtil;
    }

    public void setPackUtil(PackUtil packUtil) {
        this.packUtil = packUtil;
    }

    public PackUtil getBasicUtil() {
        return basicUtil;
    }

    public void setBasicUtil(PackUtil basicUtil) {
        this.basicUtil = basicUtil;
    }

    public PackUtil getDosageUtil() {
        return dosageUtil;
    }

    public void setDosageUtil(PackUtil dosageUtil) {
        this.dosageUtil = dosageUtil;
    }


}
