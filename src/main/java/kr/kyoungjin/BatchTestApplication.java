package kr.kyoungjin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("kr.kyoungjin.dao")
public class BatchTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchTestApplication.class, args);
	}
}
