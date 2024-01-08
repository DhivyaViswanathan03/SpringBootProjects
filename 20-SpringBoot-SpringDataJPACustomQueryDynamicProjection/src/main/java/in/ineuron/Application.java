package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.ICoronaVaccineeService;
import in.ineuron.type.ResultView1;
import in.ineuron.type.ResultView2;
import in.ineuron.type.view;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ICoronaVaccineeService service = context.getBean(ICoronaVaccineeService.class);
		service.fetchVacineByCompany("serum",ResultView2.class).forEach(vacine->{
			System.out.println(vacine.getPrice()+" "+vacine.getCompany()+" "+vacine.getCountry());
		});
		
		service.fetchVacineByCompany("serum",ResultView1.class).forEach(vacine->{
			System.out.println(vacine.getCompany()+" "+vacine.getCountry());
		});
		
		
		
		context.close();
	}

}
