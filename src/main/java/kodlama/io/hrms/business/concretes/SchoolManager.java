package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.SchoolService;
import kodlama.io.hrms.core.utilities.dtoConverter.DtoConverterService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.SchoolDao;
import kodlama.io.hrms.entities.concretes.School;
import kodlama.io.hrms.entities.dtos.SchoolDto;

@Service
public class SchoolManager implements SchoolService{
	
	private SchoolDao schoolDao;
	private DtoConverterService dtoConverterService;
@Autowired
	public SchoolManager(SchoolDao schoolDao,DtoConverterService dtoConverterService) {
		super();
		this.schoolDao = schoolDao;
		this.dtoConverterService=dtoConverterService;
	}

	@Override
	public DataResult<List<SchoolDto>> getAll() {
		return new SuccessDataResult<List<SchoolDto>>(dtoConverterService.dtoConverter(this.schoolDao.findAll(), SchoolDto.class),"Data Lİstelendi");
	}

	@Override
	public Result add(SchoolDto schoolDto) {
		this.schoolDao.save((School) this.dtoConverterService.dtoClassConverter(schoolDto, School.class));
		return new SuccessResult("Data Eklendi");
	}

}
