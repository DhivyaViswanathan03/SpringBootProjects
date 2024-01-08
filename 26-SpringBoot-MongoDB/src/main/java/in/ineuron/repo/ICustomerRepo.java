package in.ineuron.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.ineuron.document.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {
	
	public List<Customer> findByBillAmtBetween(float min,float max);
	public List<Customer> findByCnameInAndBillAmtIsNotNull(String... name);

}
