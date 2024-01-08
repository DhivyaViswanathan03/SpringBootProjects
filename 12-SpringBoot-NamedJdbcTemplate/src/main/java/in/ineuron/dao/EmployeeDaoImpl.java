package in.ineuron.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import in.ineuron.BO.EmployeeBO;
import in.ineuron.DTO.EmployeeDTO;
@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	private static final String GET_EMPLOYEE_BY_ENO = "select ename from employee where eno=:no";
	private static final String GET_EMPLOYEES_BY_DESG = "select eno,ename,age,deptno,mgrno,job from employee where job in(:job1,:job2)";
	private static final String INSERT_EMPLOYEES = "insert into employee(`ename`,`age`,`deptno`,`mgrno`,`job`)values(:ename,:age,:deptno,:mgrno,:job)";
	
	static {
		System.out.println("EmployeeDaoImpl class is loading...");
	}
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@Override
	public String getEmployeeByEno(int eno) {
		Map<String,Integer> map=Map.of("no", eno);
		return template.queryForObject(GET_EMPLOYEE_BY_ENO, map, String.class);
	}
	@Override
	public List<EmployeeBO> fetchEmployeesByJob(String job1, String job2) {
		MapSqlParameterSource param=new MapSqlParameterSource();
		param.addValue("job1", job1);
		param.addValue("job2", job2);
		List<EmployeeBO> boList=new ArrayList<>();
		return template.query(GET_EMPLOYEES_BY_DESG,param,(rs)->{
			System.out.println("EmployeeDaoImpl.fetchEmployeesByJob()");
			while(rs.next()) {
				EmployeeBO bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setAge(rs.getInt(3));
				bo.setDeptno(rs.getInt(4));
				bo.setMgrno(rs.getInt(5));
				bo.setJob(rs.getString(6));
				boList.add(bo);
			}
			
			return boList;
		});
		
		
	}
	@Override
	public int registerEmployee(EmployeeBO bo) {
		BeanPropertySqlParameterSource map=new BeanPropertySqlParameterSource(bo);
		return template.update(INSERT_EMPLOYEES, map);
	}



}
