package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.document.Customer;
import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ICustomerService service = context.getBean(ICustomerService.class);
		
//		System.out.println(service.registerCustomer(new CustomerDTO(16, "priya", 9.2f)));
		
//		service.findAll().forEach(System.out::println);
//		service.remove("64faedd5ed9f710ef528e4ce");
//		System.out.println(service.findByBillAmtBetween(9, 13));
		System.out.println(service.findByCnameInORBillAmtIsNotNull("reka","pri"));
		context.close();
	}

}
