package kodlama.io.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlama.io.hrms.business.abstracts.JobAdvertisementService;
import kodlama.io.hrms.core.utilities.dtoConverter.DtoConverterService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;
import kodlama.io.hrms.entities.dtos.JobAdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	@Autowired
	private JobAdvertisementDao jobAdvertisementDao;
	private DtoConverterService dtoConverterService;

	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao,DtoConverterService dtoConverterService) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
		this.dtoConverterService=dtoConverterService;
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getAll() {
		return new SuccessDataResult<List<JobAdvertisementDto>>(this.dtoConverterService.dtoConverter(this.jobAdvertisementDao.findAll(), JobAdvertisementDto.class), "Data Listelendi");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		//jobAdvertisement.getReleaseDate().equals(LocalDate.now());
		this.jobAdvertisementDao.save(jobAdvertisement);

		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "Data Eklendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByIsActiveTrue(),
				"Data Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByApplicationDeadlineLessThanEqualAndIsActiveTrue(LocalDate date) {
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.jobAdvertisementDao.getByApplicationDeadlineLessThanEqualAndIsActiveTrue(date), "Data Listelendi");

	}

	@Override
	public DataResult<List<JobAdvertisement>> findByEmployer(int employerId) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByEmployer(employerId),
				"Data Listelendi");
	}

	@Override
	public Result passivateAdvert(int id) {
		JobAdvertisement jobAdvertisement = jobAdvertisementDao.findById(id);
		jobAdvertisement.setActive(false);
		jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı pasif hale getirildi");
	}

//	@Override
//	public DataResult<List<JobAdvertisementDto>> getJobAdvertisementDetails() {
//		return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.getJobAdvertisementDetails(), "Data Listelendi");
//	}

}
