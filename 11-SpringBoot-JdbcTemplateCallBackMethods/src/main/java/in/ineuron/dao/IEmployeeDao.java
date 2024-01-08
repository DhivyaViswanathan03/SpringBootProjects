package in.ineuron.dao;

import java.util.List;

import in.ineuron.BO.EmployeeBO;

public interface IEmployeeDao {
	
public EmployeeBO getEmployeeByEno(Integer eno);
public List<EmployeeBO> getEmployeeByNames(String name1,String name2);
public List<EmployeeBO> getEmployeeByJob(String job1,String job2,String job3);
}
