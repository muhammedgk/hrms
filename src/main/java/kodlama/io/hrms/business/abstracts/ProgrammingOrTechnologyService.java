package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;

import kodlama.io.hrms.entities.concretes.ProgrammingOrTechnology;

public interface ProgrammingOrTechnologyService {
	
	
	DataResult<List<ProgrammingOrTechnology>> getAll();
	Result add(ProgrammingOrTechnology programmingOrTechnology);

}
