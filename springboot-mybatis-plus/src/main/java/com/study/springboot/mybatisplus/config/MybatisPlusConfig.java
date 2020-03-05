package com.study.springboot.mybatisplus.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author number47
 * @date 2019/6/19 03:10
 * @description
 */
@Configuration
@MapperScan("com.study.springboot.mybatisplus.**.mapper*")
public class MybatisPlusConfig {
	/**
	 * mybatis-plus 分页插件
	 */

	@Bean
	public PaginationInterceptor paginationInterceptor(){
		PaginationInterceptor page = new PaginationInterceptor();
		page.setDialectType("mysql");
		return page;
	}
}
