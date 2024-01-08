package in.ineuron.service;

import java.util.List;

import in.ineuron.BO.Employee;

public interface IEmployeeMgmtService {
	
	public String registerEmp(Employee emp);
	
	public List<Employee> getAllEmployees();

}
