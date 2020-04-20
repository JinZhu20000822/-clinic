package cn.jinzhu.cli.prescription.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "hos_examine_temp对象",description = "摸板项目信息关联")
public class ExamineItem {

    @ApiModelProperty(value = "摸板药品信息关联",name = "id")
    private Integer id;
    @ApiModelProperty(value = "摸板id",name = "mobanid")
    private Integer mobanid;
    @ApiModelProperty(value = "项目id",name = "jcxmid")
    private Integer jcxmid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMobanid() {
        return mobanid;
    }

    public void setMobanid(Integer mobanid) {
        this.mobanid = mobanid;
    }

    public Integer getJcxmid() {
        return jcxmid;
    }

    public void setJcxmid(Integer jcxmid) {
        this.jcxmid = jcxmid;
    }
}
