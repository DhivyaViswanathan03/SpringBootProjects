package in.ineuron.service;

import java.util.List;

import in.ineuron.dto.EmployeeDTO;

public interface IEmployeService {
	public List<EmployeeDTO>  fetchEmpsByDesgs(String desgs[])throws Exception;
}
