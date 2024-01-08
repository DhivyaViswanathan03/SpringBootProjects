package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.BO.EmployeeBO;
import in.ineuron.dao.IEmployeeDao;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	static {
		System.out.println("EmployeeServiceImpl is loading");
	}
	
	@Autowired
	private IEmployeeDao dao;
	

	@Override
	public EmployeeBO getEmployeeByno(Integer eno) {
		return dao.getEmployeeByEno(eno);
	}


	@Override
	public List<EmployeeBO> getEmployeeByNames(String name1, String name2) {
		return dao.getEmployeeByNames(name1, name2);
	}


	@Override
	public List<EmployeeBO> getEmployeeByJob(String job1, String job2, String job3) {
		// TODO Auto-generated method stub
		return dao.getEmployeeByJob(job1, job2, job3);
	}



}
