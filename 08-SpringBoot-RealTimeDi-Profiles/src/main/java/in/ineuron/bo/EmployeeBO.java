package in.ineuron.bo;

public class EmployeeBO {

	private Integer empNo;
	private String empName;
	private Integer eage;
	private String job;
	private Integer deptNo;
	private Integer mgrNo;
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEage() {
		return eage;
	}
	public void setEage(Integer eage) {
		this.eage = eage;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public Integer getMgrNo() {
		return mgrNo;
	}
	public void setMgrNo(Integer mgrNo) {
		this.mgrNo = mgrNo;
	}
	@Override
	public String toString() {
		return "EmployeeBO [empNo=" + empNo + ", empName=" + empName + ", eage=" + eage + ", job=" + job + ", deptNo="
				+ deptNo + ", mgrNo=" + mgrNo + "]";
	}
	
	
}
