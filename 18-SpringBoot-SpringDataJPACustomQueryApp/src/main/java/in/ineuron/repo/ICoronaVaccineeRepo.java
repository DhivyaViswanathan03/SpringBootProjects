package in.ineuron.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.BO.CoronoVaccine;

public interface ICoronaVaccineeRepo extends JpaRepository<in.ineuron.BO.CoronoVaccine, Integer> {

	public List<CoronoVaccine> findByCompany(String params);
	public List<CoronoVaccine> findByCompanyEquals(String params);
	public List<CoronoVaccine> findByCompanyIs(String params);
	public List<CoronoVaccine> findByPriceLessThan(Double price);
	public List<CoronoVaccine> findByCountryInAndPriceBetween(List<String> countries,double startRange,double endRange);
	public List<CoronoVaccine> findByCountryNotIn(List<String> countries);
}
