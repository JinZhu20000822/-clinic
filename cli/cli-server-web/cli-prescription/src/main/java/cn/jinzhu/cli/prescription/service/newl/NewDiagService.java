package cn.jinzhu.cli.prescription.service.newl;

import cn.jinzhu.cli.prescription.entity.hos.PatienInfo;
import cn.jinzhu.cli.prescription.mapper.hos.PatienInfoMapper;
import cn.jinzhu.cli.prescription.mapper.newl.NewDiagMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("newDiagService")
public class NewDiagService {

      @Resource
      NewDiagMapper newDiagMapper;//医嘱诊断关联表mapper

      /*添加医嘱诊断患者关联表。最大表，新开就诊表*/
      public int insertNewDiag( String TypeName,String otherdiag,String othermed, Integer patientId) {

            return newDiagMapper.insertNewDiag(TypeName,otherdiag,othermed,patientId);
      }

}
