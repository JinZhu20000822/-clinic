package cn.jinzhu.cli.masterdata.service.hos;

import cn.jinzhu.cli.masterdata.entity.hos.DiagInfo;
import cn.jinzhu.cli.masterdata.mapper.hos.DiagInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*诊断*/
@Service("diagInfoService")
public class DiagInfoService {

      @Resource
      DiagInfoMapper diagInfoMapper;//诊断表mapper

      /*查询所有诊断类型*/
      public List<DiagInfo> getAllDiagInfo() {
          return diagInfoMapper.getAllDiagInfo();
      }

}
