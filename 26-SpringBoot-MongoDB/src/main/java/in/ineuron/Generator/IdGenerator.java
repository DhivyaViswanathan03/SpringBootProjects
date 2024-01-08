package in.ineuron.Generator;

import java.util.UUID;

public class IdGenerator {
	
	public String generateId() {
		return UUID.randomUUID().toString().substring(0,10);
	}

}
