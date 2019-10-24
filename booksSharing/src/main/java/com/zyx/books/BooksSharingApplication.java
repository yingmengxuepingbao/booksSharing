package com.zyx.books;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyx.books.mapper")
public class BooksSharingApplication {
	public static void main(String[] args) {
		SpringApplication.run(BooksSharingApplication.class, args);
	}
}
