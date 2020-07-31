package com.zyx.books;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.zyx.books.mapper")	
public class BooksSharingApplication extends SpringBootServletInitializer{
	//外部使用tomcat	  
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){ 
		  return builder.sources(BooksSharingApplication.class); 
		  }
	 
	
	public static void main(String[] args) {
		SpringApplication.run(BooksSharingApplication.class, args);
	}
}
