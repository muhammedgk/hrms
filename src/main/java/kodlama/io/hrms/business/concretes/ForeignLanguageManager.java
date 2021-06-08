package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.ForeignLanguageService;
import kodlama.io.hrms.core.utilities.dtoConverter.DtoConverterService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.ForeignLanguageDao;
import kodlama.io.hrms.entities.concretes.ForeignLanguage;
import kodlama.io.hrms.entities.dtos.ForeignLanguageDto;

@Service
public class ForeignLanguageManager implements ForeignLanguageService {
	
	private ForeignLanguageDao foreignLanguageDao;
	private DtoConverterService dtoConverterService;
	
	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao,DtoConverterService dtoConverterService) {
		super();
		this.foreignLanguageDao = foreignLanguageDao;
		this.dtoConverterService=dtoConverterService;
	}

	@Override
	public DataResult<List<ForeignLanguageDto>> getAll() {
		return new SuccessDataResult<List<ForeignLanguageDto>>(this.dtoConverterService.dtoConverter(this.foreignLanguageDao.findAll(),ForeignLanguageDto.class));
	}

	@Override
	public Result add(ForeignLanguageDto foreignLanguageDto) {
		this.foreignLanguageDao.save((ForeignLanguage) this.dtoConverterService.dtoClassConverter(foreignLanguageDto, ForeignLanguage.class));
		return new SuccessResult("Data Kaydedildi");
	}

}
