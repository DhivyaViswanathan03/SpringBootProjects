package in.ineuron.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.type.ResultView;

public interface ICoronaVaccineeRepo extends JpaRepository<in.ineuron.BO.CoronoVaccine, Integer> {
 public List<ResultView> findByPriceGreaterThanOrderByPrice(Double price);
}
