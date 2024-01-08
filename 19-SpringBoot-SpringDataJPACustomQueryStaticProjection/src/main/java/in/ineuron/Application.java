package in.ineuron;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.ICoronaVaccineeService;
import in.ineuron.type.ResultView;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ICoronaVaccineeService service = context.getBean(ICoronaVaccineeService.class);
		List<ResultView> listValue=service.searchVacineByPrice(120.0);
		listValue.forEach(vacine->{
			System.out.println("ResultView Impl class is :"+vacine.getClass().getName());
			System.out.println(vacine.getCompany()+" "+vacine.getCountry());
		});
		context.close();
	}

}
