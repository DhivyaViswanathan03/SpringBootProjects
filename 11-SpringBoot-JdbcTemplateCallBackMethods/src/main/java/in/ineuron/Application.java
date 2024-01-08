package in.ineuron;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.BO.EmployeeBO;
import in.ineuron.service.EmployeeServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
		EmployeeBO bo = service.getEmployeeByno(4);
		System.out.println(bo);
		
		System.out.println();
		
		List<EmployeeBO> bolist = service.getEmployeeByNames("divs", "priya");
		bolist.forEach(System.out::println);
		
		System.out.println();
		
		service.getEmployeeByJob("clerk", "SI", "man").forEach(System.out::println);
	}

}
