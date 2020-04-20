package cn.jinzhu.cli.masterdata.entity.hos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "diag_info对象",description = "诊断信息表")
public class DiagInfo {

    @ApiModelProperty(value = "诊断信息主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "诊断内容",name = "content")
    private String content;
    @ApiModelProperty(value = "创建时间",name = "createDate")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date createDate;
    @ApiModelProperty(value = "创建人",name = "createId")

    //@JsonIgnore
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
