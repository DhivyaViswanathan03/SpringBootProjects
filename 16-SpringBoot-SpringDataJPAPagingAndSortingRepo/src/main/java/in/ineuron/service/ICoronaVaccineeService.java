package in.ineuron.service;

import java.util.List;

import in.ineuron.BO.CoronoVaccine;

public interface ICoronaVaccineeService {
	
	public Iterable<CoronoVaccine> fetchDetails(boolean asc,String... properties);
	public List<CoronoVaccine> fecthDetailsByPage(int pageNo,int pageSize,boolean asc,String... properties);
	public void fetchDetailsByPagination(int pageSize);
}
