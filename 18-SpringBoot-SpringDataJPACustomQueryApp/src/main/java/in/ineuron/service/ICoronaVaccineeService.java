package in.ineuron.service;

import java.util.List;

import in.ineuron.BO.CoronoVaccine;

public interface ICoronaVaccineeService {
	
	public List<CoronoVaccine> fetchVacineByCompany(String params);
	
	public List<CoronoVaccine> fecthVacineByPrice(Double price);
	
	public List<CoronoVaccine> fetchVacineByCountryAndPriceRange(List<String> countries,double startRange,double endRange);
	public List<CoronoVaccine> fecthVacineByNotInCountry(List<String> countries);
	
}
