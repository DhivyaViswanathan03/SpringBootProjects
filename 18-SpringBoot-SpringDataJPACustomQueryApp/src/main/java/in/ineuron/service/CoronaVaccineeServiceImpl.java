package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.BO.CoronoVaccine;
import in.ineuron.repo.ICoronaVaccineeRepo;

@Service
public class CoronaVaccineeServiceImpl implements ICoronaVaccineeService {
	
	@Autowired
	private ICoronaVaccineeRepo repo;

	@Override
	public List<CoronoVaccine> fetchVacineByCompany(String params) {
	List<CoronoVaccine> listvacines=repo.findByCompany(params);
		repo.findByCompanyEquals(params).forEach(System.out::println);
		repo.findByCompanyIs(params).forEach(System.out::println);
		return listvacines;
	}

	@Override
	public List<CoronoVaccine> fecthVacineByPrice(Double price) {
		List<CoronoVaccine> listVacines=repo.findByPriceLessThan(price);
		return listVacines;
	}

	@Override
	public List<CoronoVaccine> fetchVacineByCountryAndPriceRange(List<String> countries, double startRange,
			double endRange) {
		List<CoronoVaccine> listVacines=repo.findByCountryInAndPriceBetween(countries, startRange, endRange);
		return listVacines;
	}

	@Override
	public List<CoronoVaccine> fecthVacineByNotInCountry(List<String> countries) {
		return repo.findByCountryNotIn(countries);
	}

	
}
