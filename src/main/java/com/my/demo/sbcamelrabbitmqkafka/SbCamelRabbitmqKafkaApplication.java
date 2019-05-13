package com.my.demo.sbcamelrabbitmqkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:my-camel.xml")
public class SbCamelRabbitmqKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbCamelRabbitmqKafkaApplication.class, args);
	}

}
