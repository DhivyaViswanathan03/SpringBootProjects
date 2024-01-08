package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.component.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		Employee e=context.getBean(Employee.class);
		System.out.println(e);
		
		((ConfigurableApplicationContext) context).close();
	}

}
