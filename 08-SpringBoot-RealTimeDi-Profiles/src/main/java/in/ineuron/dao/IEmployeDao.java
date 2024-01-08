package in.ineuron.dao;

import java.util.List;

import in.ineuron.bo.EmployeeBO;

public interface IEmployeDao {
	
	public List<EmployeeBO> getEmpsByDes(String cond) throws Exception;


}
