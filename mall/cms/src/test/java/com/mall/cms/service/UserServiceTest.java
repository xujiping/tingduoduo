package com.mall.cms.service;
import com.mall.cms.entity.CmsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xujiping
 * @date 2018/6/9 17:21
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
public class UserServiceTest {

    @Test
    public void list(){
        CmsUser user = new CmsUser();
        System.out.println("用户列表：" + user.selectAll());
    }
}
