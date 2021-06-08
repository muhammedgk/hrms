package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobExperience;
import kodlama.io.hrms.entities.dtos.JobExperienceDto;


public interface JobExperienceService {

	
	DataResult<List<JobExperienceDto>> getAll();
	Result add(JobExperienceDto jobExperienceDto);
}
