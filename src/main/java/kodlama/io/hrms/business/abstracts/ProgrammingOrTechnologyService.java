package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;

import kodlama.io.hrms.entities.concretes.ProgrammingOrTechnology;
import kodlama.io.hrms.entities.dtos.ProgrammingOrTechnologyDto;

public interface ProgrammingOrTechnologyService {
	
	
	DataResult<List<ProgrammingOrTechnologyDto>> getAll();
	Result add(ProgrammingOrTechnologyDto programmingOrTechnologydto);

}
