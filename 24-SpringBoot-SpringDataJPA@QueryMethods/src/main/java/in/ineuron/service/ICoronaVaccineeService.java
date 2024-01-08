package in.ineuron.service;

import java.util.Date;
import java.util.List;

import in.ineuron.BO.CoronoVaccine;

public interface ICoronaVaccineeService {
	
	public List<CoronoVaccine> searchvaccineByCompany(String company);
	
	public List<Object[]> fetchvaccineByPrice(double price1,double price2);
	
	public int removevacineByPrice(double startPrice,double endPrice);
	
	public int updateVacineByPriceAndCompany(double price,String company);
	
	public int insertValue(String company,String country,Double price,Integer requiredDosage,String vacineName);
	
	public Date getSystemDate();
}
