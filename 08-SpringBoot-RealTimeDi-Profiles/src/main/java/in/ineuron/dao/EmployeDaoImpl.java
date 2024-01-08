package in.ineuron.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.EmployeeBO;

@Repository("empdao")
@Profile({"dev","uat"})
public class EmployeDaoImpl implements IEmployeDao {
	Connection con=null;
	
	@Autowired
	private DataSource ds;
	
	private static String query="select eno,ename,age,job,deptno,mgrno from employee where job in";
	
	
	@Override
	public List<EmployeeBO> getEmpsByDes(String desg) throws Exception {
		List<EmployeeBO> boList=null;
		try {
			
			boList=new ArrayList<>();
			Connection con=ds.getConnection();
			Statement st=con.createStatement();
			
			ResultSet rs = st.executeQuery(query+desg);
			EmployeeBO bo=null;
			while(rs.next()) {
				bo=new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEmpName(rs.getString(2));
				bo.setEage(rs.getInt(3));
				bo.setJob(rs.getString(4));
				bo.setDeptNo(rs.getInt(5));
				bo.setMgrNo(rs.getInt(6));
				boList.add(bo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return boList;
	}

}
