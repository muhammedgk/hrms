package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.ForeignLanguage;
import kodlama.io.hrms.entities.dtos.ForeignLanguageDto;


public interface ForeignLanguageService {
	DataResult<List<ForeignLanguageDto>> getAll();
	Result add(ForeignLanguageDto foreignLanguageDto);

}
