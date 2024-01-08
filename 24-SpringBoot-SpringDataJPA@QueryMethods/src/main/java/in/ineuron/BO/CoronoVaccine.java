package in.ineuron.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class CoronoVaccine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private Integer regno;
	@NonNull
	private String vacineName;
	@NonNull
	private String company;
	@NonNull
	private  String country;
	@NonNull
	private Double price;
	@NonNull
	private Integer requiredDosage;
	


}
