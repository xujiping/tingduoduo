package com.mall.cms.config;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import com.mall.cms.handler.MyMetaObjectHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Mybatis Plus 配置
 * @author xujiping
 * @date 2018/6/9 16:42
 */
@Configuration
@MapperScan("com.mall.cms.mapper*")
public class MybatisPlusConfig {

    /**
     * mybatis-plus SQL执行效率插件【生产环境可以关闭】
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * 分页插件，自动识别数据库类型
     * 多租户，请参考官网【插件扩展】
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    public MetaObjectHandler metaObjectHandler(){
        return new MyMetaObjectHandler();
    }
}
