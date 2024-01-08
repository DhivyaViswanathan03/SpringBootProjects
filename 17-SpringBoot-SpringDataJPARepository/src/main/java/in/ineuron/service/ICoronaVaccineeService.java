package in.ineuron.service;

import java.util.List;

import in.ineuron.BO.CoronoVaccine;

public interface ICoronaVaccineeService {
	
	public List<CoronoVaccine> searchVacineByData(CoronoVaccine vacine,boolean asc,String...properties);
	public CoronoVaccine fetchVacineById(int id);
	public String removevacineById(Iterable<Integer> ids);
	
}
