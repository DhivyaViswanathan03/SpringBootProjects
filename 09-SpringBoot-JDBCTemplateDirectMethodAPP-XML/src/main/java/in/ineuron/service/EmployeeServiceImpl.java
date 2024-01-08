package in.ineuron.service;

import java.util.List;
import java.util.Map;

import in.ineuron.dao.IEmployeeDao;

public class EmployeeServiceImpl implements IEmployeeService {
	
	static {
		System.out.println("EmployeeServiceImpl is loading");
	}
	
	private IEmployeeDao dao;
	
	
	EmployeeServiceImpl(IEmployeeDao dao){
		System.out.println("EmployeeServiceImpl is instantiated...");
		this.dao=dao;
	}


	@Override
	public int fetchEmployeeCount() {
		return dao.getEmployeeCount();
	}


	@Override
	public String getEmployeeByno(Integer eno) {
		return dao.getEmployeeByEno(eno);
	}


	@Override
	public Map<String, Object> getEmployeeDetailsByNo(Integer eno) {
		
		return dao.getEmployeeDetailsByNo(eno);
	}


	@Override
	public List<Map<String, Object>> getEmployeeBYDesg(String desg1, String desg2) {
		return dao.getEmployeeBYDesg(desg1, desg2);
	}


	@Override
	public int insertEmployee(String ename, int eage, int deptno, int mgrno, String job) {
		return dao.insertEmployee(ename, eage, deptno, mgrno, job);
	}


	@Override
	public int updateEmployee(String desg, int age) {
		return dao.updateEmployee(desg, age);
	}

}
