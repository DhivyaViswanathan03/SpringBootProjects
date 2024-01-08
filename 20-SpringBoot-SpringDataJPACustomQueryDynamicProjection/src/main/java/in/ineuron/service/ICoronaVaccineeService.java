package in.ineuron.service;

import java.util.List;

import in.ineuron.type.view;

public interface ICoronaVaccineeService {
	
	public <T extends view> List<T> fetchVacineByCompany(String company,Class<T> clazz);
}
