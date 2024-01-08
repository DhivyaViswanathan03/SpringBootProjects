package in.ineuron.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class PdfRunner implements ApplicationRunner {

	@Value("${spring.application.name}")
	private String name;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("PdfRunner.run()");
		System.out.println("Args are:"+Arrays.asList(args.getSourceArgs()));
		System.out.println(args.getNonOptionArgs());
		if(args.getNonOptionArgs().contains("hello")) {
			System.out.println("Email dump done..");
		}
		
		System.out.println(name);
	}

}
