package com.mall.cms.service;

import com.mall.cms.entity.CmsContent;
import com.mall.cms.entity.CmsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
        CmsUser cmsUser = new CmsUser();
        List<CmsUser> cmsUsers = cmsUser.selectAll();
        System.out.println("查询结果：" + cmsUsers);
    }
}
