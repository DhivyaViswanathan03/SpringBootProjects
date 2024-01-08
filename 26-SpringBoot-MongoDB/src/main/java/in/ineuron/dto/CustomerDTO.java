package in.ineuron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class CustomerDTO {
	@NonNull
	private Integer cno;
	
	@NonNull
	private String cname;
	
	@NonNull
	private Float billAmt;
}
