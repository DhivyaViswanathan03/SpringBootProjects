package in.ineuron.service;

import java.util.List;

import in.ineuron.document.Customer;
import in.ineuron.dto.CustomerDTO;

public interface ICustomerService {
	
	public String registerCustomer(CustomerDTO dto);
	
	public List<Customer> findAll();
	
	public String remove(String id);
	
	public List<Customer> findByBillAmtBetween(float min,float max);
	
	public List<Customer> findByCnameInORBillAmtIsNotNull(String... name);

}
