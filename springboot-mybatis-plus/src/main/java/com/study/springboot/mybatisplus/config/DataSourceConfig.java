package com.study.springboot.mybatisplus.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author number47
 * @date 2019/6/19 03:08
 * @description 数据源配置
 */
@Configuration
public class DataSourceConfig {

	@Bean(name="dataSource")
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource(){
		return new DruidDataSource();
	}

	/**
	 * 配置事务管理器
 	 */
	@Bean(name="transactionManager")
	public DataSourceTransactionManager transactionManager(){
		return new DataSourceTransactionManager(dataSource());
	}

}
