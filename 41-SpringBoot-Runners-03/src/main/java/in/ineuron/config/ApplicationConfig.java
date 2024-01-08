package in.ineuron.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ineuron.methoreference.SampleTest;

@Configuration
public class ApplicationConfig {
	//Anonymous
//	@Bean
//	public CommandLineRunner run() {
//		return new CommandLineRunner() {
//			
//			@Override
//			public void run(String... args) throws Exception {
//            System.out.println("args are:"+Arrays.asList(args));				
//			}
//		};
//	}
	//Lamda expression
	
//	@Bean
//	public CommandLineRunner run() {
//		return (args)->{
//			System.out.println("args are:"+Arrays.asList(args));
//		};
//	}

	@Bean
	public CommandLineRunner run() {
		return SampleTest::test;
	}
}
