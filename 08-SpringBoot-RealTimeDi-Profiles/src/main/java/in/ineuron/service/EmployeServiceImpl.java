package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.EmployeeBO;
import in.ineuron.dao.IEmployeDao;
import in.ineuron.dto.EmployeeDTO;

@Service("empService")
public class EmployeServiceImpl implements IEmployeService{
	
	@Autowired
	private IEmployeDao dao;


	@Override
	public List<EmployeeDTO> fetchEmpsByDesgs(String[] desgs) throws Exception {
		
		StringBuilder builder=new StringBuilder("(");
		
		for(int i=0;i<desgs.length;i++) {
	      if(i==desgs.length-1) {
	    	  builder.append("'"+desgs[i]+"')");
	      }else {
	    	  builder.append("'"+desgs[i]+"',");
	      }
		}
		String cond=builder.toString();
		List<EmployeeDTO> dtoList=new ArrayList<>();
		List<EmployeeBO> boList=dao.getEmpsByDes(cond);
		boList.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSrNo(dtoList.size()+1);
			dtoList.add(dto);
		});
		
		return dtoList;
	}

}
