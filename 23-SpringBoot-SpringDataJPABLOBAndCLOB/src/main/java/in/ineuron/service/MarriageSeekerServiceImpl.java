package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.BO.MarriageSeeker;
import in.ineuron.repo.IMarriageSeekerRepo;

@Service
public class MarriageSeekerServiceImpl implements IMarriageSeekerService {
	
	@Autowired
	private IMarriageSeekerRepo repo;

	@Override
	public String registerMarriageSeeker(MarriageSeeker seeker) {
		return "Info saved successfully with id "+repo.save(seeker).getPid();
	}

	@Override
	public Optional<MarriageSeeker> searchSeekerById(Integer id) {
		return repo.findById(id);
	}

}
