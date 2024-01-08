package com.navis.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "org.info")
//@PropertySource(value = "com/navis/commons/input.properties")
public class Company {
	
	private String companyname;
	private String location;
	private Integer size;
	private String pincode;
	
	static {
		System.out.println("Company class is loading..");
	}
	
	public Company() {
		System.out.println("Company zero param is called....");
	}
	
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
		System.out.println("Company.setCompanyname()");
	}
	public void setLocation(String location) {
		this.location = location;
		System.out.println("Company.setLocation()");
	}
	public void setSize(Integer size) {
		this.size = size;
		System.out.println("Company.setSize()");
	}
	
	public void setPincode(String pincode) {
		this.pincode = pincode;
		System.out.println("Company.setPincode()");
	}
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", location=" + location + ", size=" + size + ", pincode="
				+ pincode + "]";
	}
	
	

}
