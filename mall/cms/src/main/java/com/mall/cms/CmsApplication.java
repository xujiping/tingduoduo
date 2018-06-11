package com.mall.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author xujiping
 * @date 2018/6/9 16:41
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.mall.cms.mapper"})
@ServletComponentScan(basePackages = {"com.mall.cms.config"})
public class CmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }
}
