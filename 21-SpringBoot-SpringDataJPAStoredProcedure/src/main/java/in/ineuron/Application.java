package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.IproductMgmtService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		IproductMgmtService service = context.getBean(IproductMgmtService.class);
		service.getProductdsByname("priya", "divs").forEach(System.out::println);
		context.close();
	}

}
