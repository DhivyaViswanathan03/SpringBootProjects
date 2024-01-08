package in.ineuron.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.BO.CoronoVaccine;
import in.ineuron.repo.ICoronaVaccineeRepo;

@Service
public class CoronaVaccineeServiceImpl implements ICoronaVaccineeService {
	
	@Autowired
	private ICoronaVaccineeRepo repo;

	@Override
	public String registerVaccinee(CoronoVaccine vaccinee) {
		System.out.println("InMemoryProxy class is:"+repo.getClass().getName());
     CoronoVaccine vaccine = repo.save(vaccinee);
     if(vaccine !=null) {
    	 return "Registration success";
     }else {
    	 return "Registration Failed";
     }
	}

	@Override
	public Iterable<CoronoVaccine> registerInBatch(Iterable<CoronoVaccine> vaccines) {
		Iterable<CoronoVaccine> result = repo.saveAll(vaccines);
		if(result!=null) {
			return result;
		}else {
			throw new IllegalArgumentException("Wrong type is passed");
		}
	}

	@Override
	public boolean findAvailability(int id) {
		return repo.existsById(id);
	}

	@Override
	public int vacineCount() {
    return (int) repo.count();		
	}

	@Override
	public Optional<CoronoVaccine> findDetailsById(int id) {
		return repo.findById(id);
		
		
		
	}

	@Override
	public Iterable<CoronoVaccine> findAllByIds(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return repo.findAllById(ids);
		
	}

	@Override
	public Iterable<CoronoVaccine> findAllDetails() {
		return repo.findAll();
	}

	@Override
	public String removeVacineById(int id) {
		Optional<CoronoVaccine> result = repo.findById(id);
		if(result.isPresent()) {
			repo.deleteById(id);
			return "Deletion success";
		}else {
			return"Deletion failed";
		}
	}

	@Override
	public String removeVacine(CoronoVaccine vacine) {
		Optional<CoronoVaccine> result=repo.findById(vacine.getRegno());
		if(result.isPresent()) {
			repo.delete(vacine);
			return "Deletion success";
		}else {
			return"Deletion failed";
		}
	}

	@Override
	public String removeVacineByIds(List<Integer> ids) {
		Iterable<CoronoVaccine> results = repo.findAllById(ids);
		int count=ids.size();
		if(count==((List) results).size()) {
			repo.deleteAll(results);
			return "Deletion success";
		}else {
			return"Deletion failed";
		}
	}
	
	

}
