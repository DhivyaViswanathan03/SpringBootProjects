package in.ineuron.BO;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class MarriageSeeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	
	@NonNull
	private String pname;
	
	@NonNull
	private String paddress;
	
	@NonNull
	@Lob
	private byte[] photo;
	
	@NonNull
	@Lob
	private char[] biodata;
	
	@NonNull
	private LocalDateTime dob;

}
