package in.ineuron;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.ICoronaVaccineeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ICoronaVaccineeService service = context.getBean(ICoronaVaccineeService.class);
		
//		service.searchvaccineByCompany("russia").forEach(System.out::println);
//		
//		System.out.println();
//		List<Object[]> objects=service.fetchvaccineByPrice(100, 200);
//		for(Object[] obj:objects) {
//			for(Object val:obj) {
//				System.out.print(val);
//			}
//			System.out.println();
//		}
//		
		
//		System.out.println("No of records deleted is: "+service.removevacineByPrice(100, 200));
		
		//System.out.println("No of records updated is :"+service.updateVacineByPriceAndCompany(100.0, "russia"));
//		System.out.println("No of rows inserted is :"+service.insertValue("Russia","USA" , 100.0,2,"covaxin"));
//				context.close();
		
		System.out.println(service.getSystemDate());
	}

}
