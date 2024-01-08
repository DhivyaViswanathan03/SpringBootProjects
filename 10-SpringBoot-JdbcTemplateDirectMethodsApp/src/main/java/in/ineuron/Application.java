package in.ineuron;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.EmployeeServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
		Map<String,Object> empDetails=service.getEmployeeDetailsByNo(7);
		System.out.println(empDetails);
	}

}
