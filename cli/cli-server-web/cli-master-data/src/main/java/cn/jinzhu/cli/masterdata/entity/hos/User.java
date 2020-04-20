package cn.jinzhu.cli.masterdata.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 用户信息
 */
@ApiModel(value = "user对象",description = "用户信息类")
public class User {

    @ApiModelProperty(value = "用户id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "姓名",name = "name")
    private String name;
    @ApiModelProperty(value = "编号",name = "number")
    private String number;
    @ApiModelProperty(value = "年龄",name = "age")
    private Integer age;
    @ApiModelProperty(value = "性别",name = "sex")
    private boolean sex;
    @ApiModelProperty(value = "联系方式(登录账号)",name = "phone")
    private String phone;
    @ApiModelProperty(value = "邮箱地址",name = "email")
    private String email;
    @ApiModelProperty(value = "身份证号",name = "idCard")
    private String idCard;
    @ApiModelProperty(value = "职位",name = "position")
    private String position;
    @ApiModelProperty(value = "地址",name = "address")
    private String address;
    @ApiModelProperty(value = "详细地址",name = "addDetails")
    private String addDetails;
    @ApiModelProperty(value = "密码",name = "password")
    private String password;

    @ApiModelProperty(value = "所属科室对象",name = "department")
    private Department department;
    @ApiModelProperty(value = "角色列表",name = "roleList")
    private List<Role> roleList;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
