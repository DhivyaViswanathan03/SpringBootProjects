package com.navis;

import java.io.IOException;

import com.navis.component.Company;
import com.navis.component.Company2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		
		Company c=context.getBean(Company.class);
		System.out.println(c);
		
		System.in.read();
		
		Company2 c2=context.getBean(Company2.class);
		System.out.println(c2);
		
		((ConfigurableApplicationContext) context).close();
	}

}
