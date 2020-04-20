package cn.jinzhu.cli.prescription.entity.hos;

import cn.jinzhu.cli.masterdata.entity.hos.MemberCate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "患者信息实体类",description = "患者信息描述类")
public class PatienInfo {

    @ApiModelProperty(value = "患者信息主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "患者姓名",name = "name")
    private String name;
    @ApiModelProperty(value = "患者卡号",name = "cardNo")
    private String cardNo;
    @ApiModelProperty(value = "性别",name = "sex")
    private boolean sex;
    @ApiModelProperty(value = "年龄",name = "age")
    private Integer age;
    @ApiModelProperty(value = "生日",name = "birthday")
    private Date birthday;
    @ApiModelProperty(value = "联系方式",name = "phone")
    private String phone;
    @ApiModelProperty(value = "身份证号",name = "idCard")
    private String idCard;
    @ApiModelProperty(value = "地址",name = "address")
    private String address;
    @ApiModelProperty(value = "详细地址",name = "addDetails")
    private String addDetails;
    @ApiModelProperty(value = "密码",name = "password")
    private String password;
    @ApiModelProperty(value = "工作单位",name = "jobUnit")
    private String jobUnit;
    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;

    @ApiModelProperty(value = "患者来源对象",name = "sourc")
    private PatienSourc sourc;
    @ApiModelProperty(value = "患者学历对象",name = "edu")
    private PatienEdu edu;
    @ApiModelProperty(value = "患者职业对象",name = "occ")
    private PatienOcc occ;
    @ApiModelProperty(value = "会员对象",name = "memberCate")
    private MemberCate memberCate;

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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddDetails() {
        return addDetails;
    }

    public void setAddDetails(String addDetails) {
        this.addDetails = addDetails;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobUnit() {
        return jobUnit;
    }

    public void setJobUnit(String jobUnit) {
        this.jobUnit = jobUnit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public PatienSourc getSourc() {
        return sourc;
    }

    public void setSourc(PatienSourc sourc) {
        this.sourc = sourc;
    }

    public PatienEdu getEdu() {
        return edu;
    }

    public void setEdu(PatienEdu edu) {
        this.edu = edu;
    }

    public PatienOcc getOcc() {
        return occ;
    }

    public void setOcc(PatienOcc occ) {
        this.occ = occ;
    }

    public MemberCate getMemberCate() {
        return memberCate;
    }

    public void setMemberCate(MemberCate memberCate) {
        this.memberCate = memberCate;
    }

}
