package cn.jinzhu.cli.prescription.entity.newl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "newl_diag_medlist对象",description = "医嘱信息与新开就诊关联信息")
public class DiagMedlist {

    @ApiModelProperty(value = "医嘱信息、新开就诊主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "医嘱信息主键id",name = "adviceId")
    private Integer adviceId;
    @ApiModelProperty(value = "新开就诊主键id",name = "newdiagId")
    private Integer newdiagId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(Integer adviceId) {
        this.adviceId = adviceId;
    }

    public Integer getNewdiagId() {
        return newdiagId;
    }

    public void setNewdiagId(Integer newdiagId) {
        this.newdiagId = newdiagId;
    }
}
