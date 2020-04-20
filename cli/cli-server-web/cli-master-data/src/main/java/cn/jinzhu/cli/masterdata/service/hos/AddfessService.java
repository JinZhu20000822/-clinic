package cn.jinzhu.cli.masterdata.service.hos;

import cn.jinzhu.cli.masterdata.entity.hos.Addfess;
import cn.jinzhu.cli.masterdata.entity.hos.Advice;
import cn.jinzhu.cli.masterdata.mapper.hos.AddfessMapper;
import cn.jinzhu.cli.masterdata.mapper.hos.AdviceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*诊断*/
@Service("addfessService")
public class AddfessService {

      @Resource
      AddfessMapper addfessMapper;//医嘱表mapper

      /*查询所有附加费用类型*/
      public List<Addfess> getAllAddfesse() {
          return addfessMapper.getAllAddfesse();
      }

}
