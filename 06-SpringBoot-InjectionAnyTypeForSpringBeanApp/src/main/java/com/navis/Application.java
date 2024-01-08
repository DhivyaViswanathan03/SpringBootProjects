package com.navis;

import java.io.IOException;

import com.navis.component.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		
		Employee e=context.getBean(Employee.class);
		System.out.println(e);
		
		((ConfigurableApplicationContext) context).close();
	}

}
