package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import in.ineuron.BO.CoronoVaccine;
import in.ineuron.repo.ICoronaVaccineeRepo;

@Service
public class CoronaVaccineeServiceImpl implements ICoronaVaccineeService {
	
	@Autowired
	private ICoronaVaccineeRepo repo;

	@Override
	public List<CoronoVaccine> searchVacineByData(CoronoVaccine vacine, boolean asc, String... properties) {
		Example<CoronoVaccine> example = Example.of(vacine);
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, properties);
	    List<CoronoVaccine> results = repo.findAll(example, sort);
		return results;
	}

	@Override
	public CoronoVaccine fetchVacineById(int id) {
		CoronoVaccine vacine = repo.getReferenceById(id);
		return vacine;
	}

	@Override
	public String removevacineById(Iterable<Integer> ids) {
		List<CoronoVaccine> listEntities = repo.findAllById(ids);
		if(listEntities!=null) {
			repo.deleteAllByIdInBatch(ids);
			return listEntities.size()+" no of records deleted";
		}
		return "Record not found";
	}

}
