package in.ineuron.dao;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	
	private static final String SQL_SELECT_QUERY = "select count(*) from employee";
	private static final String SQL_SELECT_QUERY_BY_ID = "select ename from employee where eno=?";
	private static final String GET_EMPLOYEE_BY_ID = "select eno,ename,age,deptno,mgrno,job from employee where eno=?";
	private static final String SQL_SELECT_BY_DESG = "select eno,ename,age,deptno,mgrno,job from employee where job in(?,?)";
	private static final String SQL_INSERT_EMPLOYEE = "insert into employee(`ename`,`age`,`deptno`,`mgrno`,`job`) values(?,?,?,?,?)";
	private static final String SQL_UPDATE_EMPLOYEE = "update employee set age=age+? where job=?" ;
    
	static {
		System.out.println("EmployeeDaoImpl class is loading...");
	}
	
		
	@Autowired
	private JdbcTemplate template;
	

	@Override
	public int getEmployeeCount() {
		return template.queryForObject(SQL_SELECT_QUERY, Integer.class);
	}

	@Override
	public String getEmployeeByEno(Integer eno) {
		return template.queryForObject(SQL_SELECT_QUERY_BY_ID, String.class,eno);
	}

	@Override
	public Map<String, Object> getEmployeeDetailsByNo(Integer eno) {
		return template.queryForMap(GET_EMPLOYEE_BY_ID,eno);
	}

	@Override
	public List<Map<String, Object>> getEmployeeBYDesg(String desg1, String desg2) {
		return template.queryForList(SQL_SELECT_BY_DESG, desg1,desg2);
	}

	@Override
	public int insertEmployee(String ename, int eage, int deptno, int mgrno, String job) {
		return template.update(SQL_INSERT_EMPLOYEE, ename,eage,deptno,mgrno,job);
	}

	@Override
	public int updateEmployee(String desg, int age) {
		return template.update(SQL_UPDATE_EMPLOYEE, age,desg);
	}

}
