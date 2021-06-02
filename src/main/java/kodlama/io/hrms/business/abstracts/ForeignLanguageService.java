package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.ForeignLanguage;


public interface ForeignLanguageService {
	DataResult<List<ForeignLanguage>> getAll();
	Result add(ForeignLanguage foreignLanguage);

}
