package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.BO.CoronoVaccine;

public interface ICoronaVaccineeService {
	
	public String registerVaccinee(CoronoVaccine vaccinee);
	
	public Iterable<CoronoVaccine> registerInBatch(Iterable<CoronoVaccine> vaccines);
	
	public boolean findAvailability(int id);
	
	public int vacineCount();
	
	public Optional<CoronoVaccine> findDetailsById(int id);
	public Iterable<CoronoVaccine> findAllByIds(Iterable<Integer> ids); 
    public Iterable<CoronoVaccine> findAllDetails();
    
    public String removeVacineById(int id);
    public String removeVacine(CoronoVaccine vacine);
    public String removeVacineByIds(List<Integer> ids);
}
