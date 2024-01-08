package in.ineuron.vo;

public class EmployeeVO {
	private String srNo;
	private String empNo;
	private String empName;
	private String eage;
	private String job;
	private String deptNo;
	private String mgrNo;
	
	public String getSrNo() {
		return srNo;
	}
	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEage() {
		return eage;
	}
	public void setEage(String eage) {
		this.eage = eage;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getMgrNo() {
		return mgrNo;
	}
	public void setMgrNo(String mgrNo) {
		this.mgrNo = mgrNo;
	}
	@Override
	public String toString() {
		return "EmployeeVO [srNo=" + srNo + ", empNo=" + empNo + ", empName=" + empName + ", eage=" + eage + ", job="
				+ job + ", deptNo=" + deptNo + ", mgrNo=" + mgrNo + "]";
	}
	
	
}
