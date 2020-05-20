package com.skcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsaUserApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaUserApiApplication.class, args);
	}


	// jenkins - git 연동 테스트 위해 소스코드 수정

}
