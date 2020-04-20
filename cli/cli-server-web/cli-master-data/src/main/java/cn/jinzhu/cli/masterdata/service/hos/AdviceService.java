package cn.jinzhu.cli.masterdata.service.hos;

import cn.jinzhu.cli.masterdata.entity.hos.Advice;
import cn.jinzhu.cli.masterdata.mapper.hos.AdviceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*诊断*/
@Service("adviceService")
public class AdviceService {

      @Resource
      AdviceMapper adviceMapper;//医嘱表mapper

      /*查询所有诊断类型*/
      public List<Advice> getAllAdvice() {
          return adviceMapper.getAllAdvice();
      }

}
