package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
	public Iterable<CoronoVaccine> fetchDetails(boolean asc, String... properties) {
		System.out.println("proxy class is::"+repo.getClass().getName());
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		return repo.findAll(sort);
	}

	@Override
	public List<CoronoVaccine> fecthDetailsByPage(int pageNo, int pageSize, boolean asc, String... properties) {
		PageRequest pageable = PageRequest.of(pageNo,pageSize,asc?Direction.ASC:Direction.DESC,properties);
		Page<CoronoVaccine> result = repo.findAll(pageable);
		return result.getContent();
	}

	@Override
	public void fetchDetailsByPagination(int pageSize) {
		// total record count
//		int value = repo.count();
				int value = (int) repo.count();// total = 7
				int pageCount=value / pageSize;
				pageCount=value % pageSize ==0?pageCount:++pageCount;
				for(int i=0;i<pageCount;i++) {
					PageRequest pageable = PageRequest.of(i, pageSize);
					Page<CoronoVaccine> result = repo.findAll(pageable);
					result.getContent().forEach((vacine)->System.out.println(vacine.getPrice()+" "+vacine.getCompany()));
					System.out.println("......."+(i+1)+"of "+result.getTotalPages());
				}
				
		
	}

	

}
