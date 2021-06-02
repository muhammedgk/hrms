package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobExperience;


public interface JobExperienceService {

	
	DataResult<List<JobExperience>> getAll();
	Result add(JobExperience jobExperience);
}
