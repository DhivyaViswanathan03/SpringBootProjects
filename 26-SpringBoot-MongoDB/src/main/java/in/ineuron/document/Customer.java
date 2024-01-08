package in.ineuron.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {
	
	@Id
	private String cid;
	
	@NonNull
	private Integer cno;
	
	@NonNull
	private String cname;
	
	@NonNull
	private Float billAmt;
	

}