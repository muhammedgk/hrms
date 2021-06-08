package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.School;
import kodlama.io.hrms.entities.dtos.SchoolDto;

public interface SchoolService {

	DataResult<List<SchoolDto>> getAll();
	Result add(SchoolDto schoolDto);
}
