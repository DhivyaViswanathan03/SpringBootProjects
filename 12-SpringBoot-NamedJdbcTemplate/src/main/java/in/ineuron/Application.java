package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.DTO.EmployeeDTO;
import in.ineuron.service.EmployeeServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
		try {
			String name=service.getEmployeeByEno(4);
			System.out.println("Employee name is:"+name);
			System.out.println();
			service.fetchEmployeesByJob("clerk", "SI").forEach(System.out::println);
			
			System.out.println();
			EmployeeDTO dto=new EmployeeDTO();
			dto.setEname("Moulidharan");
			dto.setAge(40);
			dto.setDeptno(123);
			dto.setMgrno(345);
			dto.setJob("Manager");
			String msg=service.registerEmployee(dto);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
