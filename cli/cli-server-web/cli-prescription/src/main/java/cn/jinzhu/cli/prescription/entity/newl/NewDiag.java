package cn.jinzhu.cli.prescription.entity.newl;


import cn.jinzhu.cli.masterdata.entity.hos.Advice;
import cn.jinzhu.cli.masterdata.entity.hos.DiagInfo;
import cn.jinzhu.cli.prescription.entity.hos.PatienInfo;
import cn.jinzhu.cli.prescription.entity.med.MenCheck;
import cn.jinzhu.cli.prescription.entity.med.MenEast;
import cn.jinzhu.cli.prescription.entity.med.MenWestern;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "newl_diag对象",description = "新开就诊信息")
public class NewDiag {

    @ApiModelProperty(value = "新开就诊主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "诊断类型",name = "consultationType")
    private String consultationType;
    @ApiModelProperty(value = "其他诊断信息",name = "otherDiag")
    private String otherDiag;
    @ApiModelProperty(value = "其他医嘱信息",name = "otherMed")
    private String otherMed;

    @ApiModelProperty(value = "患者信息对象",name = "patienInfo")
    private PatienInfo patienInfo;
    @ApiModelProperty(value = "诊断信息列表",name = "diagInfoList")
    private List<DiagInfo> diagInfoList;
    @ApiModelProperty(value = "医嘱信息列表",name = "adviceList")
    private List<Advice> adviceList;
    @ApiModelProperty(value = "西药处方列表",name = "menWesternList")
    private List<MenWestern> menWesternList;
    @ApiModelProperty(value = "中药处方列表",name = "menEastList")
    private List<MenEast> menEastList;
    @ApiModelProperty(value = "检查项目列表",name = "menCheckList")
    private List<MenCheck> menCheckList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsultationType() {
        return consultationType;
    }

    public void setConsultationType(String consultationType) {
        this.consultationType = consultationType;
    }

    public String getOtherDiag() {
        return otherDiag;
    }

    public void setOtherDiag(String otherDiag) {
        this.otherDiag = otherDiag;
    }

    public String getOtherMed() {
        return otherMed;
    }

    public void setOtherMed(String otherMed) {
        this.otherMed = otherMed;
    }

    public PatienInfo getPatienInfo() {
        return patienInfo;
    }

    public void setPatienInfo(PatienInfo patienInfo) {
        this.patienInfo = patienInfo;
    }

    public List<DiagInfo> getDiagInfoList() {
        return diagInfoList;
    }

    public void setDiagInfoList(List<DiagInfo> diagInfoList) {
        this.diagInfoList = diagInfoList;
    }

    public List<Advice> getAdviceList() {
        return adviceList;
    }

    public void setAdviceList(List<Advice> adviceList) {
        this.adviceList = adviceList;
    }

    public List<MenWestern> getMenWesternList() {
        return menWesternList;
    }

    public void setMenWesternList(List<MenWestern> menWesternList) {
        this.menWesternList = menWesternList;
    }

    public List<MenEast> getMenEastList() {
        return menEastList;
    }

    public void setMenEastList(List<MenEast> menEastList) {
        this.menEastList = menEastList;
    }

    public List<MenCheck> getMenCheckList() {
        return menCheckList;
    }

    public void setMenCheckList(List<MenCheck> menCheckList) {
        this.menCheckList = menCheckList;
    }
}
