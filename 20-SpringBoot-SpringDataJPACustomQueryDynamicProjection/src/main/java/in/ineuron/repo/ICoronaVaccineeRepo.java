package in.ineuron.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.type.view;

public interface ICoronaVaccineeRepo extends JpaRepository<in.ineuron.BO.CoronoVaccine, Integer> {
	
	public <T extends view> List<T> findByCompanyOrderByPrice(String company,Class<T> clazz);
}
