package in.ineuron.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.ineuron.dto.EmployeeDTO;
import in.ineuron.service.IEmployeService;
import in.ineuron.vo.EmployeeVO;

@Controller("empController")
public class EmployeController {
	
	@Autowired
	private IEmployeService service;
	
	public List<EmployeeVO> showEmpsByDesg(String[] desgs) throws Exception{
		
		List<EmployeeDTO> dtoList=service.fetchEmpsByDesgs(desgs);
		
		List<EmployeeVO> voList=new ArrayList<>();
		
		dtoList.forEach(dto->{
			EmployeeVO vo=new EmployeeVO();
			vo.setEmpNo(dto.getEmpNo().toString());
			vo.setEmpName(dto.getEmpName());
			vo.setEage(dto.getEage().toString());
			vo.setJob(dto.getJob());
			vo.setDeptNo(dto.getDeptNo().toString());
			vo.setMgrNo(dto.getMgrNo().toString());
			vo.setSrNo(dto.getSrNo().toString());
			voList.add(vo);
			
		});
		return voList;
		
	}

}
