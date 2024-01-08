package in.ineuron;

import java.beans.PropertyVetoException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import in.ineuron.controller.EmployeController;
import in.ineuron.vo.EmployeeVO;

@SpringBootApplication
public class Application {
	
	static {
		System.out.println("Application class is loading..");
	}
	
	public Application() {
		System.out.println("Application zero param is called...");
	}
	
	@Autowired
	private Environment env;
	
	@Bean("pool")
	@Profile("uat")
	public ComboPooledDataSource createDs() throws PropertyVetoException{
		System.out.println("Application.createDs()...");
		ComboPooledDataSource dataSource=new ComboPooledDataSource();
		dataSource.setJdbcUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUser(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		dataSource.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
		return dataSource;
		
	}
	
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Bean names are::"+Arrays.toString(context.getBeanDefinitionNames()));
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter desg count");
		int count=in.nextInt();
		String[] desg=null;
		
		if(count>=1) {
			desg=new String[count];
		}else {
			System.out.println("Invalid count");
		}
		
		for(int i=0;i<count;i++) {
			System.out.println("Enter desg");
			String desgination=in.next();
			desg[i]=desgination;
		}
		
		EmployeController con = context.getBean("empController",EmployeController.class);
		 try {
			List<EmployeeVO> voList = con.showEmpsByDesg(desg);
			voList.forEach(vo->{
				System.out.println(vo);
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
