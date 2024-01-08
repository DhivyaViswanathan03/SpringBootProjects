package in.ineuron.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDao {
	
public int getEmployeeCount();

public String getEmployeeByEno(Integer eno);
public Map<String,Object> getEmployeeDetailsByNo(Integer eno);
public List<Map<String,Object>> getEmployeeBYDesg(String desg1,String desg2);
public int insertEmployee(String ename,int eage,int deptno,int mgrno,String job);
public int updateEmployee(String desg,int age);
}
