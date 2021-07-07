package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilities.dtoConverter.DtoConverterService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.dtos.EmployerDto;

@Service
public class EmployerManager implements EmployerService {
	@Autowired
	private EmployerDao employerDao;
	private DtoConverterService dtoConverterService;

	public EmployerManager(EmployerDao employerDao,DtoConverterService dtoConverterService) {
		super();
		this.employerDao = employerDao;
		this.dtoConverterService=dtoConverterService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Şirket Eklendi");
	}

	@Override
	public Result update(int employerId, EmployerDto employerDto) {
		Employer refEmployer = this.employerDao.getOne(employerId);
		refEmployer.setCompanyName(refEmployer.getCompanyName());
		refEmployer.setEmail(refEmployer.getEmail());
		refEmployer.setWebsiteEmail(refEmployer.getWebsiteEmail());
		refEmployer.setPhoneNumber(refEmployer.getPhoneNumber());
		refEmployer.setPassword(refEmployer.getPassword());
		this.employerDao.save((Employer) this.dtoConverterService.dtoClassConverter(employerDto, Employer.class));
		return new SuccessResult("Başarılı");
	}

}
