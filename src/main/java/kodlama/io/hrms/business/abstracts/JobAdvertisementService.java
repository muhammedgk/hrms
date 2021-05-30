package kodlama.io.hrms.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();
	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> findByIsActiveTrue();
	DataResult<List<JobAdvertisement>> getByApplicationDeadlineLessThanEqualAndIsActiveTrue(LocalDate date);
	DataResult<List<JobAdvertisement>> findByEmployer(int employerId);
	Result passivateAdvert(int id);

}