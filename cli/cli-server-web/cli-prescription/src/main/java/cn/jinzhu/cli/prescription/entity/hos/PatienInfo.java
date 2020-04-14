package cn.jinzhu.cli.prescription.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "患者信息实体类",description = "患者信息描述类")
public class PatienInfo {
    @ApiModelProperty(value = "患者id")
    private Integer id;
    @ApiModelProperty(value = "患者名")
    private String username;
    @ApiModelProperty(value = "患者地址")
    private String address;

}
