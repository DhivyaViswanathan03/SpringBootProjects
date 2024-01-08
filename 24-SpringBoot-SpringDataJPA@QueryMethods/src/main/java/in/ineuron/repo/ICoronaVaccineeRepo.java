package in.ineuron.repo;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.ineuron.BO.CoronoVaccine;

public interface ICoronaVaccineeRepo extends JpaRepository<in.ineuron.BO.CoronoVaccine, Integer> {
	
//	@Query("from CoronoVaccine where company=:comp")
//	@Query("from CoronoVaccine where company=?1")
	@Query("from CoronoVaccine where company=:ventor")
	public List<CoronoVaccine> searchvaccineByCompany(String ventor);
	
	@Query("select company,country,price from CoronoVaccine where price between :min and :max")
	public List<Object[]> searchVaccineByprice(double min,double max);
	
	
	@Query("delete from CoronoVaccine where price between :startPrice and :endPrice")
	@Transactional
	@Modifying
    public int removevacineByPrice(double startPrice,double endPrice);
	
	
	@Query("update CoronoVaccine set price=:price where company=:company")
	@Modifying
	public int updateVacineByPriceAndCompany(Double price,String company);
	
	@Transactional
	@Modifying
	@Query(value = "insert into corono_vaccine(`company`,`country`,`price`,`required_dosage`,`vacine_name`) values(?,?,?,?,?)",nativeQuery = true)
	public int insertValue(String company,String country,Double price,
			Integer requiredDosage,String vacineName);
	
	@Query(value = "select now() from dual",nativeQuery = true)
	public Date getSystemDate();
	
}
