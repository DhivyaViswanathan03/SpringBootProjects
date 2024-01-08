package in.ineuron.DTO;

public class EmployeeDTO {
	private Integer eno;
	private String ename;
	private Integer age;
	private Integer deptno;
	private Integer mgrno;
	private String job;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public Integer getMgrno() {
		return mgrno;
	}
	public void setMgrno(Integer mgrno) {
		this.mgrno = mgrno;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [eno=" + eno + ", ename=" + ename + ", age=" + age + ", deptno=" + deptno + ", mgrno="
				+ mgrno + ", job=" + job + "]";
	}
	
	
}
