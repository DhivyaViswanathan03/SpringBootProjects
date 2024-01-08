package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.repo.ICoronaVaccineeRepo;
import in.ineuron.type.ResultView;

@Service
public class CoronaVaccineeServiceImpl implements ICoronaVaccineeService {
	
	@Autowired
	private ICoronaVaccineeRepo repo;

	@Override
	public List<ResultView> searchVacineByPrice(Double price) {
		return repo.findByPriceGreaterThanOrderByPrice(price);
	}

	
	
}
