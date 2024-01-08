package in.ineuron.service;

import java.util.Arrays;

import org.apache.tomcat.util.http.MimeHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service("service")
public class PurchaseOrderImpl implements IPurchaseOrder {
	
	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String fromEmail;

	@Override
	public String purchase(String[] items, double[] prices, String[] toEmails) throws MessagingException {
		double amt=0.0;
		for(double price:prices) {
			amt=amt+price;
		}
		String msg=Arrays.toString(items)+" with price "+Arrays.toString(prices)+" total bill amount is"+amt;
		String status=sendMail(msg,toEmails);
		return msg+".......>"+status;
	}

	private String sendMail(String msg, String[] toEmails) throws MessagingException {
		System.out.println("Mail impl class is :"+sender.getClass().getName());
		MimeMessage mimeMessage = sender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(mimeMessage, true);
		helper.setFrom(fromEmail);
		helper.setCc(toEmails);
		helper.setSubject("Let it open to know it");
		helper.setText(msg);
		sender.send(mimeMessage);
		return "mail-sent";
	}

}
