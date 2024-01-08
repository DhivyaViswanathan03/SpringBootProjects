package in.ineuron;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.BO.Employee;
import in.ineuron.service.IEmployeeMgmtService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		IEmployeeMgmtService service = context.getBean(IEmployeeMgmtService.class);
		Employee employee=new Employee("priya", LocalDateTime.of(1990, 6, 10, 12, 0), LocalTime.of(11, 45), LocalDate.of(1990, 03,2));
		String msg=service.registerEmp(employee);
		System.out.println(msg);
		
		System.out.println();
		
		service.getAllEmployees().forEach(System.out::println);
		context.close();
	}

}
