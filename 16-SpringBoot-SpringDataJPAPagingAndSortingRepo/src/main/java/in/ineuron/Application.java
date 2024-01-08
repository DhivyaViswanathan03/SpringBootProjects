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
		
//		service.fetchDetails(true, "price","company").forEach(System.out::println);
//		service.fetchDetails(false, "price","company").forEach((vacine)->System.out.println(vacine.getPrice()+"...."+vacine.getCompany()));
		
		//service.fecthDetailsByPage(0,4, false, "price","company").forEach((vacine)->System.out.println(vacine.getPrice()+"  "+vacine.getCompany()));
		
		service.fetchDetailsByPagination(1);
		context.close();
	}

}
