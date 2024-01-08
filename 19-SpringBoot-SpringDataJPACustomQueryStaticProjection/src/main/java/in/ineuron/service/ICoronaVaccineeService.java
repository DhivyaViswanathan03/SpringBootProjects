package in.ineuron.service;

import java.util.List;

import in.ineuron.type.ResultView;

public interface ICoronaVaccineeService {
	
	public List<ResultView> searchVacineByPrice(Double price);
	
}
