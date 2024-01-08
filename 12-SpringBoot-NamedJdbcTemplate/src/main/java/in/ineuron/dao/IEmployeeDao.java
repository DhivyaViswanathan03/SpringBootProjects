package in.ineuron.dao;

import java.util.List;

import in.ineuron.BO.EmployeeBO;
import in.ineuron.DTO.EmployeeDTO;

public interface IEmployeeDao {
	
	public String getEmployeeByEno(int eno);
	public List<EmployeeBO> fetchEmployeesByJob(String job1,String job2);
	public int registerEmployee(EmployeeBO bo);
}
