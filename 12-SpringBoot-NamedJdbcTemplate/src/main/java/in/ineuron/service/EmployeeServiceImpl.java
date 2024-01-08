package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.BO.EmployeeBO;
import in.ineuron.DTO.EmployeeDTO;
import in.ineuron.dao.IEmployeeDao;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	static {
		System.out.println("EmployeeServiceImpl is loading");
	}
	
	@Autowired
	private IEmployeeDao dao;

	@Override
	public String getEmployeeByEno(int eno) {
		return dao.getEmployeeByEno(eno);
	}

	@Override
	public List<EmployeeDTO> fetchEmployeesByJob(String job1, String job2) {
		List<EmployeeBO> boList=dao.fetchEmployeesByJob(job1, job2);
		List<EmployeeDTO> dtoList=new ArrayList<>();
		boList.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			dtoList.add(dto);
		});
		return dtoList;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) {
		EmployeeBO bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		return dao.registerEmployee(bo)==1?"success":"failed";
	}
	

	


}
