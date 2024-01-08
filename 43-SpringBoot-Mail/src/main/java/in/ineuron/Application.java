package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.IPurchaseOrder;
import jakarta.mail.MessagingException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		IPurchaseOrder bean=context.getBean(IPurchaseOrder.class);
		String msg;
		try {
			msg = bean.purchase(new String[] {"fossil","USpolo","LouisPhillipe"}, new double[] {66.8d,77.5d,88.5d}, 
					new String[] {"dhivya.viswanathan@kaleris.com","dhivyaviswanathantce@gmail.com"});
			System.out.println(msg);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    context.close();
	}

}

