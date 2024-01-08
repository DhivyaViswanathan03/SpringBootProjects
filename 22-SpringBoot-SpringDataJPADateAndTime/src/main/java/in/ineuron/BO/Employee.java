package in.ineuron.BO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String ename;
	private LocalDateTime dob;
	private LocalTime dom;
	private LocalDate doj;
	
	public Employee() {
		
	}
	
	public Employee(String ename, LocalDateTime dob, LocalTime dom, LocalDate doj) {
		super();
		this.ename = ename;
		this.dob = dob;
		this.dom = dom;
		this.doj = doj;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public LocalTime getDom() {
		return dom;
	}
	public void setDom(LocalTime dom) {
		this.dom = dom;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dob=" + dob + ", dom=" + dom + ", doj=" + doj + "]";
	}
	
	

}
