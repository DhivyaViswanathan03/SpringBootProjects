package in.ineuron;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.BO.CoronoVaccine;
import in.ineuron.service.ICoronaVaccineeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ICoronaVaccineeService service = context.getBean(ICoronaVaccineeService.class);
//		CoronoVaccine vacine=new CoronoVaccine();
//		vacine.setPrice(320.0);
//        service.searchVacineByData(vacine, false, "price","company").forEach(System.out::println);
		
//		try {
//			CoronoVaccine vacine = service.fetchVacineById(3);
//			System.out.println("record found::"+vacine);
//		} catch (Exception e) {
//			System.out.println("Record Not Found");
//		}
		List<Integer> ids=new ArrayList<>();
		ids.add(11);
		ids.add(12);
		String message=service.removevacineById(ids);
		System.out.println(message);
		context.close();
	}

}
