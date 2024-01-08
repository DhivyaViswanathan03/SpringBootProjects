package in.ineuron.service;

import jakarta.mail.MessagingException;

public interface IPurchaseOrder {
	
	public String purchase(String[] items,double[] prices,String[] toEmails) throws MessagingException;

}
