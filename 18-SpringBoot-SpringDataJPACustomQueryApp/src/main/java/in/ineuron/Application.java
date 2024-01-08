package in.ineuron;

import java.util.ArrayList;
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

		//		String param="serum";
		//service.fetchVacineByCompany(param).forEach(System.out::println);
		//service.fecthVacineByPrice(230.0).forEach(System.out::println);
		List<String> countries=new ArrayList<>();
		countries.add("russian");
		//service.fetchVacineByCountryAndPriceRange(countries, 100.0, 500.0).forEach(System.out::println);
		service.fecthVacineByNotInCountry(countries).forEach(System.out::println);
		context.close();
	}

}
