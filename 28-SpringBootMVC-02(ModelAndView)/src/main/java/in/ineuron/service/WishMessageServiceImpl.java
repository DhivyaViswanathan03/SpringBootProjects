package in.ineuron.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String getWishMessage() {
		LocalDateTime ldt = LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour < 12) return "GOOD MORNING";
		else if(hour<16) return "GOOD NOON";
		else if(hour <20) return "GOOD EVENING";
		else
			return "GOOD NIGHT";
	}

}
