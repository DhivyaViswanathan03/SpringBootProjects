package in.ineuron.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {

	public int fetchEmployeeCount();
	
	public String getEmployeeByno(Integer eno);
	
	public Map<String,Object> getEmployeeDetailsByNo(Integer eno);
	
	public List<Map<String,Object>> getEmployeeBYDesg(String desg1,String desg2);
	
	public int insertEmployee(String ename,int eage,int deptno,int mgrno,String job);
	
	public int updateEmployee(String desg,int age);
}
