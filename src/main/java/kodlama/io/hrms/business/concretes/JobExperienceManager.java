package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobExperienceService;
import kodlama.io.hrms.core.utilities.dtoConverter.DtoConverterService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlama.io.hrms.entities.concretes.JobExperience;
import kodlama.io.hrms.entities.dtos.JobExperienceDto;

@Service
public class JobExperienceManager implements JobExperienceService {

	private JobExperienceDao jobExperienceDao;
	private DtoConverterService  dtoConverterService;
	

	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao,DtoConverterService  dtoConverterService) {
		super();
		this.jobExperienceDao = jobExperienceDao;
		this.dtoConverterService = dtoConverterService;
	}

	@Override
	public DataResult<List<JobExperienceDto>> getAll() {
		return new SuccessDataResult<List<JobExperienceDto>>(this.dtoConverterService.dtoConverter(this.jobExperienceDao.findAll(), JobExperienceDto.class));
	}

	@Override
	public Result add(JobExperienceDto jobExperienceDto) {
		this.jobExperienceDao.save((JobExperience) this.dtoConverterService.dtoClassConverter(jobExperienceDto, JobExperience.class));
		return new SuccessResult("Data Eklendi");
	}

}
