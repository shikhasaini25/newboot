package com.school.cityschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
/* @EnableCaching */
public class CityschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityschoolApplication.class, args);
	
	
	
	
		// 11. Bean Lifecycle methods
	
		/*
		 * ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml"); Pojo
		 * obj = (Pojo) c.getBean("ap"); obj.execute(); System.out.println(); obj =
		 * (Pojo) c.getBean("ap1"); obj.execute();
		 */
    
}
     
}
	
	


