import com.javakc.cms.modules.copyright.entity.Copyright;
import com.javakc.cms.modules.copyright.service.CopyrightService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class Test {
    @Autowired
    private CopyrightService service;
    @org.junit.Test
    public void test(){
//        Copyright entity=new Copyright();
//        entity.setCopyrightName("222");
//        entity.setCompany("石家庄");
//        entity.setRemarks("原因");
//        service.save(entity);
      List<Copyright> list=service.findAllList();
        System.out.println(list);
    }
}
