package com.navis.component;

import org.springframework.stereotype.Component;

@Component
public class Company {
	
	private String name;
	private String location;
	private Integer size;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", size=" + size + "]";
	}
	
	

}
