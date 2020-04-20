package cn.jinzhu.cli.masterdata.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "item_examine对象",description = "检查项目配置对象")
public class ItemExamine {

    @ApiModelProperty(value = "项目检查配置主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "项目编号",name = "number")
    private String number;
    @ApiModelProperty(value = "项目名称",name = "name")
    private String name;
    @ApiModelProperty(value = "成本价",name = "cost")
    private float cost;
    @ApiModelProperty(value = "零售价",name = "price")
    private float price;
    @ApiModelProperty(value = "状态",name = "status")
    private boolean status;
    @ApiModelProperty(value = "创建日期",name = "createDate")
    private Date createDate;
    @ApiModelProperty(value = "其他单位",name = "otherUtil")
    private String otherUtil;
    @ApiModelProperty(value = "其他分类",name = "otherCate")
    private String otherCate;
    @ApiModelProperty(value = "其他发票项目",name = "otherInvoice")
    private String otherInvoice;
    @ApiModelProperty(value = "部位",name = "part")
    private String part;
    @ApiModelProperty(value = "允许折扣",name = "discount")
    private boolean discount;
    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;
    @ApiModelProperty(value = "创建人",name = "user")
    private User user;

    @ApiModelProperty(value = "项目分类对象",name = "itemCate")
    private ItemCate itemCate;
    @ApiModelProperty(value = "项目单位对象",name = "itemUtil")
    private ItemUtil itemUtil;
    @ApiModelProperty(value = "发票项目对象",name = "invoiceItem")
    private InvoiceItem invoiceItem;

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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getOtherUtil() {
        return otherUtil;
    }

    public void setOtherUtil(String otherUtil) {
        this.otherUtil = otherUtil;
    }

    public String getOtherCate() {
        return otherCate;
    }

    public void setOtherCate(String otherCate) {
        this.otherCate = otherCate;
    }

    public String getOtherInvoice() {
        return otherInvoice;
    }

    public void setOtherInvoice(String otherInvoice) {
        this.otherInvoice = otherInvoice;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
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

    public ItemCate getItemCate() {
        return itemCate;
    }

    public void setItemCate(ItemCate itemCate) {
        this.itemCate = itemCate;
    }

    public ItemUtil getItemUtil() {
        return itemUtil;
    }

    public void setItemUtil(ItemUtil itemUtil) {
        this.itemUtil = itemUtil;
    }

    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
