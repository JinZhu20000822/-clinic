package cn.jinzhu.cli.prescription.entity.hos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "hso_item_type对象",description = "项目检查类型")
public class ItemType {
    @ApiModelProperty(value = "项目检查id",name = "id")
    private int id;
    @ApiModelProperty(value = "项目检查名称",name = "xmmcName")
    private String xmmcName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getXmmcName() {
        return xmmcName;
    }

    public void setXmmcName(String xmmcName) {
        this.xmmcName = xmmcName;
    }
}
