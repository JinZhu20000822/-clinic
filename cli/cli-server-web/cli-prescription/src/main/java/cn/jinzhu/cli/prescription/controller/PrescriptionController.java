package cn.jinzhu.cli.prescription.controller;

import cn.jinzhu.cli.common.http.HttpClientHelper;
import cn.jinzhu.cli.common.response.RespBean;
import cn.jinzhu.cli.common.response.Response;
import cn.jinzhu.cli.masterdata.entity.hos.ItemCate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

//调用其他模块的接口
@Api(tags = "新开就诊prescription")
@RestController
@RequestMapping("/api/prescription")
public class PrescriptionController {
    @Value("${server.masterdata.url}")
    private String serverMasterdataUrl;
    @Value("${server.medicine.url}")
    private String serverMedicineUrl;


    @Autowired
    private HttpClientHelper httpClientHelper;
    @ApiOperation(value = "调用8084基础模块_诊断",notes = "查询所有诊断AdivcerController")
    @GetMapping("/getAlladivce")
    public Response getAlladivce(){
        return  httpClientHelper.getlistResponse(serverMasterdataUrl + "/api/masterdata/hos/adivce");
    }


    @ApiOperation(value = "调用8084基础模块_医嘱",notes = "查询所有医嘱DiagInfoController")
    @GetMapping("/getAllDiagInfo")
    public Response getAllDiagInfo(){
        return  httpClientHelper.getlistResponse(serverMasterdataUrl + "/api/masterdata/hos/diag/info");
    }


    @ApiOperation(value = "调用8084基础模块_附加费用类型",notes = "查询所有附加费用类型AddfessController")
    @GetMapping("/getAllAddfess")
    public Response getAllAddfess(){
        return  httpClientHelper.getlistResponse(serverMasterdataUrl + "/api/masterdata/hos/addfess");
    }

    @ApiOperation(value = "调用8084基础模块_科室类型",notes = "查询所有科室类型和他下面的员工DepartmentController")
    @GetMapping("/getAllDepartmentUserBydepId")
    public Response getAllDepartmentUserBydepId(Integer id){
        StringBuffer buffer = new StringBuffer("?");
        if(id!=null) {
            buffer.append("&id=").append(id);
        }
        return  httpClientHelper.getlistResponse(serverMasterdataUrl + "/api/masterdata/hos/department"+buffer);
    }


    @ApiOperation(value = "调用8086药品模块",notes = "根据处方id和药品名称药品类型id查询药品类型下的药品DrugInformationController")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码，查询第几页数据,必填",name = "pageNum", required = true),
            @ApiImplicitParam(value = "每页显示几条,必填",name = "pageSize", required = true),
            @ApiImplicitParam(value = "药品名称和拼音",name = "commonName"),
            @ApiImplicitParam(value = "处方实体类id",name = "id"),
            @ApiImplicitParam(value = "药品分类id", name = "drugId",  defaultValue = "0"),
    })
    @GetMapping("/getDrugInformationByPrescriTypeId")
    public Response getDrugInformationByPrescriTypeId(Integer pageNum, Integer pageSize, Integer id, String commonName,String pinyin,Integer drugId) throws UnsupportedEncodingException {
        if(pageNum == null) pageNum = 1;
        if(pageSize == null) pageSize = 5;
        StringBuffer buffer = new StringBuffer("?").append("pageNum=").append(pageNum).append("&pageSize=").append(pageSize);
        if(id!=null) {
            buffer.append("&id=").append(id);
        }
        if(!StringUtils.isEmpty(commonName)) {
            buffer.append("&commonName=").append(URLEncoder.encode(commonName, "UTF-8"));
        }
        if(!StringUtils.isEmpty(pinyin)) {
            buffer.append("&pinyin=").append(URLEncoder.encode(pinyin, "UTF-8"));
        }
        if(drugId!=null) {
            buffer.append("&drugId=").append(drugId);
        }
        return  httpClientHelper.getForResponse(serverMedicineUrl + "/api/masterdata/hos/drug/information"+buffer);
    }


    @ApiOperation(value = "调用8084项目信息模块",notes = "根据项目分类id和项目名称查询项目分类下的项目ItemExamineController")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码，查询第几页数据,必填",name = "pageNum", required = true),
            @ApiImplicitParam(value = "每页显示几条,必填",name = "pageSize", required = true),
            @ApiImplicitParam(value = "项目名称和拼音",name = "name"),
            @ApiImplicitParam(value = "项目分类id",name = "id"),
    })
    @GetMapping("/getAllItemCateeItemExaminByItemCateeId")
    public Response getAllItemCateeItemExaminByItemCateeId(Integer pageNum, Integer pageSize, Integer id, String name) throws UnsupportedEncodingException {
        if(pageNum == null ) pageNum = 1;
        if(pageSize == null)pageSize = 5;
        StringBuffer buffer= new StringBuffer("?").append("pageNum=").append(pageNum).append("&pageSize=").append(pageSize);
        if(id != null){
            buffer.append("&id=").append(id);
        }
        if(! StringUtils.isEmpty(name)){
            buffer.append("&name=").append(URLEncoder.encode(name, "UTF-8"));
        }
        return  httpClientHelper.getForResponse(serverMasterdataUrl + "/api/masterdata/hos/item/examine"+buffer);
    }
}
