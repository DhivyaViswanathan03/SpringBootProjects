package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import in.ineuron.BO.Employee;
import in.ineuron.repo.IEmployeeDao;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDao dao;

	@Override
	public String registerEmp(Employee emp) {
		int eid=dao.save(emp).getEid();
		return "Employee saved successfully with id :"+eid;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> results=(List<Employee>) dao.findAll();
		return results;
	}

}
