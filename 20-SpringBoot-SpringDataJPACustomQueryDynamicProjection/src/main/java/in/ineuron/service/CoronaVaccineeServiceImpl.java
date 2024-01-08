package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.repo.ICoronaVaccineeRepo;
import in.ineuron.type.view;

@Service
public class CoronaVaccineeServiceImpl implements ICoronaVaccineeService {
	
	@Autowired
	private ICoronaVaccineeRepo repo;

	@Override
	public <T extends view> List<T> fetchVacineByCompany(String company,Class<T> clazz) {
		return repo.findByCompanyOrderByPrice(company,clazz);
	}

	
}
