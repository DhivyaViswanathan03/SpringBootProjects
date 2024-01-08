package in.ineuron.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.info")
//@PropertySource(value = "com/navis/commons/input.properties")
public class Company2 {
	
	@Value("${user.info.companyname}")
	private String companyname;
	
	@Value("${user.info.location}")
	private String location;
	
	@Value("${user.info.size}")
	private Integer size;
	
	@Value("${user.info.pincode}")
	private String pincode;
	
	static {
		System.out.println("Company2 class is loading...");
	}
	
	Company2(){
		System.out.println("Company2 zero param is called..");
	}
	
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
		System.out.println("Company2.setCompanyname()");
	}
	public void setLocation(String location) {
		this.location = location;
		System.out.println("Company2.setLocation()");
	}
	public void setSize(Integer size) {
		this.size = size;
		System.out.println("Company2.setSize()");
	}
	
	public void setPincode(String pincode) {
		this.pincode = pincode;
		System.out.println("Company2.setPincode()");
	}
	@Override
	public String toString() {
		return "Company2 [companyname=" + companyname + ", location=" + location + ", size=" + size + ", pincode="
				+ pincode + "]";
	}
	
	

}
