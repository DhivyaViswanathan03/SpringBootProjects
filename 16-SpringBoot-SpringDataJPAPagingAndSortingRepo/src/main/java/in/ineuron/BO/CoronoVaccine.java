package in.ineuron.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CoronoVaccine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer regno;
	private String vacineName;
	private String company;
	private  String country;
	private Double price;
	private Integer requiredDosage;
	
	public CoronoVaccine(){
		
	}
	
	public CoronoVaccine(Integer regno, String vacineName, String company, String country, Double price,
			Integer requiredDosage) {
		super();
		this.regno = regno;
		this.vacineName = vacineName;
		this.company = company;
		this.country = country;
		this.price = price;
		this.requiredDosage = requiredDosage;
	}

	public Integer getRegno() {
		return regno;
	}

	public void setRegno(Integer regno) {
		this.regno = regno;
	}

	public String getVacineName() {
		return vacineName;
	}

	public void setVacineName(String vacineName) {
		this.vacineName = vacineName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getRequiredDosage() {
		return requiredDosage;
	}

	public void setRequiredDosage(Integer requiredDosage) {
		this.requiredDosage = requiredDosage;
	}

	@Override
	public String toString() {
		return "CoronoVaccinee [regno=" + regno + ", vacineName=" + vacineName + ", company=" + company + ", country="
				+ country + ", price=" + price + ", requiredDosage=" + requiredDosage + "]";
	}
	

}
