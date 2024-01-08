package in.ineuron.service;

import java.util.List;

import in.ineuron.DTO.EmployeeDTO;

public interface IEmployeeService {
	
	public String getEmployeeByEno(int eno);
	public List<EmployeeDTO> fetchEmployeesByJob(String job1,String job2);
	public String registerEmployee(EmployeeDTO dto);
}
