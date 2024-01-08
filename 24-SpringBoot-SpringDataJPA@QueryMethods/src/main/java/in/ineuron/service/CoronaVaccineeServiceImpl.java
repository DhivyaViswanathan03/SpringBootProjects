package in.ineuron.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.BO.CoronoVaccine;
import in.ineuron.repo.ICoronaVaccineeRepo;

@Service
public class CoronaVaccineeServiceImpl implements ICoronaVaccineeService {
	
	@Autowired
	private ICoronaVaccineeRepo repo;

	@Override
	public List<CoronoVaccine> searchvaccineByCompany(String company) {
		return repo.searchvaccineByCompany(company);
	}

	@Override
	public List<Object[]> fetchvaccineByPrice(double price1, double price2) {
		return repo.searchVaccineByprice(price1, price2);
	}

	@Override
	public int removevacineByPrice(double startPrice, double endPrice) {
		// TODO Auto-generated method stub
		return repo.removevacineByPrice(startPrice, endPrice);
	}

	@Override
	@Transactional
	public int updateVacineByPriceAndCompany(double price, String company) {
		// TODO Auto-generated method stub
		return repo.updateVacineByPriceAndCompany(price, company);
	}

	@Override
	public int insertValue(String company, String country, Double price, Integer requiredDosage, String vacineName) {
		return repo.insertValue(company, country, price, requiredDosage, vacineName);
	}

	@Override
	public Date getSystemDate() {
		// TODO Auto-generated method stub
		return repo.getSystemDate();
	}

	

	
}
