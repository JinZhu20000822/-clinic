package cn.jinzhu.cli.prescription.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "hos_examine_temp对象",description = "摸板药品信息关联")
public class InfoItem {

    @ApiModelProperty(value = "摸板药品信息关联",name = "id")
    private Integer id;
    @ApiModelProperty(value = "摸板id",name = "mobanid")
    private Integer mobanid;
    @ApiModelProperty(value = "药品id",name = "yoapingid")
    private Integer yoapingid;

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

    public Integer getYoapingid() {
        return yoapingid;
    }

    public void setYoapingid(Integer yoapingid) {
        this.yoapingid = yoapingid;
    }
}
