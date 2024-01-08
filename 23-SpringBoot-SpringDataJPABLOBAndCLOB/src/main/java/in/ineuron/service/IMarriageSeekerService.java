package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.BO.MarriageSeeker;

public interface IMarriageSeekerService {
	
	public String registerMarriageSeeker(MarriageSeeker seeker);
	
	public Optional<MarriageSeeker> searchSeekerById(Integer id);

}
