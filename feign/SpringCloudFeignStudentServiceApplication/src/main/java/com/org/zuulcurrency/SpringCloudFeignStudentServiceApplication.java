package com.org.zuulcurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableEurekaClient
@FeignClient
public class SpringCloudFeignStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignStudentServiceApplication.class, args);
	}

}
