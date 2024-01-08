package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.service.IProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		IProductService service = context.getBean(IProductService.class);
		service.getProductsByName("revathi", "mouli").forEach(System.out::println);
		System.out.println();
		service.getProductsById(7);
	}

}
