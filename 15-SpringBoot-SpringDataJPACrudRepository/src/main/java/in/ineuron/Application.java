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
//		CoronoVaccine vaccine=new CoronoVaccine();
//		vaccine.setRegno(null);
//		vaccine.setVacineName("covid-schema");
//		vaccine.setCompany("bharath");
//		vaccine.setCountry("IND");
//		vaccine.setPrice(130.0D);
//		vaccine.setRequiredDosage(3);
//		String message=service.registerVaccinee(vaccine);
//		System.out.println(message);
		
//		List<CoronoVaccine> vaccines=new ArrayList<CoronoVaccine>();
//		vaccines.add(new CoronoVaccine(null, "Alpha1", "Russian1-Brand", "Russia1", 1201.3D, 2));
//		vaccines.add(new CoronoVaccine(null, "Beta1", "Olympic1-Brand", "Japan1", 1211.3D, 2));
//		vaccines.add(new CoronoVaccine(null, "Theta1", "USA1-Brand", "USA1", 1231.3D, 3));
//		Iterable<CoronoVaccine> result = service.registerInBatch(vaccines);
//		result.forEach(System.out::println);
		
//		System.out.println("find the availability of id 3 is::"+service.findAvailability(3));
//		System.out.println("Vacine count is::"+service.vacineCount());
//		Optional<CoronoVaccine> result = service.findDetailsById(13);
//		if(result.isPresent()) {
//			System.out.println(result.get());
//		}else {
//			result.orElseThrow(()-> 
//				new IllegalArgumentException("Data not found")
//			
//				
//			);
//		}
		
//		List<Integer> ids=new ArrayList();
//		ids.add(4);
//		ids.add(6);
//		ids.add(7);
//		Iterable<CoronoVaccine> results = service.findAllByIds(ids);
//		results.forEach(System.out::println);
		
//		Iterable<CoronoVaccine> results = service.findAllDetails();
//		results.forEach(System.out::println);
		
//		System.out.println(service.removeVacineById(10));
//		CoronoVaccine vacine=new CoronoVaccine(6, "Alpha1", "Russian1-Brand", "Russia1", 1201.3D, 2);
//		System.out.println(service.removeVacine(vacine));
		
		List<Integer> ids=new ArrayList();
		ids.add(4);
		ids.add(5);
		ids.add(7);
		System.out.println(service.removeVacineByIds(ids));
		context.close();
	}

}
