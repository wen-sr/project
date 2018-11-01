package com.wensir.project.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 多数据源配置类
 * Created by pure on 2018-05-06.
 */
@Configuration
public class DataSourceConfig {
    //数据源1
    @Bean(name = "prd1")
    @ConfigurationProperties(prefix = "spring.datasource.wh1") // application.properteis中对应属性的前缀
    public DataSource prd1() {
        return DataSourceBuilder.create().build();
    }

    //数据源1
    @Bean(name = "wes")
    @ConfigurationProperties(prefix = "spring.datasource.wes") // application.properteis中对应属性的前缀
    public DataSource wes() {
        return DataSourceBuilder.create().build();
    }

    //数据源2
    @Bean(name = "mysql")
    @ConfigurationProperties(prefix = "spring.datasource.db5") // application.properteis中对应属性的前缀
    public DataSource mysql() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(prd1());
        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap();
        dsMap.put("prd1", prd1());
        dsMap.put("mysql", mysql());
        dsMap.put("wes", wes());

        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }

    /**
     * 配置@Transactional注解事物
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }
}


