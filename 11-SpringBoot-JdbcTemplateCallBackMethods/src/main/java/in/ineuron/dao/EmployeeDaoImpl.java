package in.ineuron.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import in.ineuron.BO.EmployeeBO;
@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	
	private static final String SQL_SELECT_QUERY = "select eno,ename,age,deptno,mgrno,job from employee where eno=?";
	private static final String GET_EMPLOYEE_BY_NAMES = "select eno,ename,age,deptno,mgrno,job from employee where ename in(?,?)";
	private static final String GET_EMPLOYEE_BY_JOB = "select eno,ename,age,deptno,mgrno,job from employee where job in(?,?,?)";
    
	static {
		System.out.println("EmployeeDaoImpl class is loading...");
	}
	
	@Autowired
	private JdbcTemplate template;

//	@Override
//	public EmployeeBO getEmployeeByEno(Integer eno) {
//		return template.queryForObject(SQL_SELECT_QUERY,new EmployeeRowMapper(),eno);
//	}
//	

	@Override
	public EmployeeBO getEmployeeByEno(Integer eno) {
		return template.queryForObject(SQL_SELECT_QUERY,new BeanPropertyRowMapper<>(EmployeeBO.class),eno);
	}
	

	@Override
	public List<EmployeeBO> getEmployeeByNames(String name1, String name2) {
//		return template.query(GET_EMPLOYEE_BY_NAMES, (rs,rowNum)->{
//			System.out.println("EmployeeDaoImpl.EmployeeRowMapper.mapRow()");
//			EmployeeBO bo=new EmployeeBO();
//			bo.setEno(rs.getInt(1));
//			bo.setEname(rs.getString(2));
//			bo.setAge(rs.getInt(3));
//			bo.setDeptno(rs.getInt(4));
//			bo.setMgrno(rs.getInt(5));
//			bo.setJob(rs.getString(6));
//			return bo;
//		}, name1,name2);
//		return template.query(GET_EMPLOYEE_BY_NAMES,
//				new RowMapperResultSetExtractor<>(new BeanPropertyRowMapper<>(EmployeeBO.class))
//				,name1,name2);
		List<EmployeeBO> boList=new ArrayList<EmployeeBO>();
		template.query(GET_EMPLOYEE_BY_NAMES,new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				System.out
						.println("EmployeeDaoImpl.getEmployeeByNames(...).new RowCallbackHandler() {...}.processRow()...");
				EmployeeBO bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setAge(rs.getInt(3));
				bo.setDeptno(rs.getInt(4));
				bo.setMgrno(rs.getInt(5));
				bo.setJob(rs.getString(6));
				boList.add(bo);
			}
		},name1,name2);
		return boList;
//		List<EmployeeBO> boList=new ArrayList<EmployeeBO>();
//		template.query(GET_EMPLOYEE_BY_NAMES,(rs)->{
//			System.out.println("EmployeeDaoImpl.getEmployeeByNames()...");
//			EmployeeBO bo=new EmployeeBO();
//			bo.setEno(rs.getInt(1));
//			bo.setEname(rs.getString(2));
//			bo.setAge(rs.getInt(3));
//			bo.setDeptno(rs.getInt(4));
//			bo.setMgrno(rs.getInt(5));
//			bo.setJob(rs.getString(6));
//			boList.add(bo);
//		},name1,name2);
//		return boList;
	}
	
	public  class EmployeeRowMapper implements RowMapper<EmployeeBO>{

		@Override
		public EmployeeBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("EmployeeDaoImpl.EmployeeRowMapper.mapRow()");
			EmployeeBO bo=new EmployeeBO();
			bo.setEno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setAge(rs.getInt(3));
			bo.setDeptno(rs.getInt(4));
			bo.setMgrno(rs.getInt(5));
			bo.setJob(rs.getString(6));
			return bo;
		}
		
	}

	@Override
	public List<EmployeeBO> getEmployeeByJob(String job1, String job2, String job3) {
		return template.query(GET_EMPLOYEE_BY_JOB,new ResultSetExtractor<List<EmployeeBO>>() {
			List<EmployeeBO> boList=new ArrayList<EmployeeBO>();
			@Override
			public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				System.out
						.println("EmployeeDaoImpl.getEmployeeByJob(...).new ResultSetExtractor() {...}.extractData()...");
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
			}
			
		}, job1, job2,job3);
	}

}
