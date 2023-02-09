package com.br.mq;

import javax.jms.JMSException;
import javax.naming.NamingException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"com.br.mq"})
public class DemoApplication {

	public static void main(String[] args) throws NamingException, JMSException {
		SpringApplication.run(DemoApplication.class, args);
	}

}
