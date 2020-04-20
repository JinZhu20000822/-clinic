package cn.jinzhu.cli.prescription.entity.newl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "newl_diag_list对象",description = "诊断信息与新开就诊关联信息")
public class DiagList {

    @ApiModelProperty(value = "诊断信息、新开就诊关联表主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "诊断信息主键id",name = "diagId")
    private Integer diagId;
    @ApiModelProperty(value = "新开就诊主键id",name = "newDiagId")
    private Integer newdiagId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDiagId() {
        return diagId;
    }

    public void setDiagId(Integer diagId) {
        this.diagId = diagId;
    }

    public Integer getNewdiagId() {
        return newdiagId;
    }

    public void setNewdiagId(Integer newdiagId) {
        this.newdiagId = newdiagId;
    }
}
