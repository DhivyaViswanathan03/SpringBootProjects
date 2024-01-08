package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.Generator.IdGenerator;
import in.ineuron.document.Customer;
import in.ineuron.dto.CustomerDTO;
import in.ineuron.repo.ICustomerRepo;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerRepo repo;

	@Override
	public String registerCustomer(CustomerDTO dto) {
		System.out.println("impl class is :"+repo.getClass().getName());
		Customer document=new Customer();
		document.setCid(new IdGenerator().generateId());
		BeanUtils.copyProperties(dto, document);
//		document=repo.insert(document);
		return "Record inserted with id :"+repo.save(document).getCid();
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> document = repo.findAll();
		return document;
	}

	@Override
	public String remove(String id) {
		Optional<Customer> doc=repo.findById(id);
		if(doc.isPresent()) {
			repo.deleteById(id);
			return "Document deleted";
		}
		return "Document not found with given id:"+id;
	}

	@Override
	public List<Customer> findByBillAmtBetween(float min, float max) {
		
		return repo.findByBillAmtBetween(min, max);
	}

	@Override
	public List<Customer> findByCnameInORBillAmtIsNotNull(String... name) {
		return repo.findByCnameInAndBillAmtIsNotNull(name);
	}

}
