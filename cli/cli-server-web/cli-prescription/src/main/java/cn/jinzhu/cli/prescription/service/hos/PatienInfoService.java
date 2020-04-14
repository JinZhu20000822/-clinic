package cn.jinzhu.cli.prescription.service.hos;

import cn.jinzhu.cli.prescription.entity.hos.PatienInfo;
import cn.jinzhu.cli.prescription.mapper.hos.PatienInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("patienInfoService")
public class PatienInfoService {

      @Resource
      PatienInfoMapper patienInfoMapper;

      public List<PatienInfo> getAllPatienInfo() {

          return patienInfoMapper.getAllPatienInfo();/*查询所有患者*/
      }

}
