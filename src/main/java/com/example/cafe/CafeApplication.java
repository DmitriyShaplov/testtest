package com.example.cafe;

import com.example.cafe.dto.Menus;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Menus.class)
@MapperScan("com.example.cafe.mapper")
@SpringBootApplication
public class CafeApplication {
	public static void main(String[] args) {
		SpringApplication.run(CafeApplication.class, args);
	}
}
