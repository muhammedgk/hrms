package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.Workplace;

public interface WorkplaceService {
	DataResult<List<Workplace>> getAll();

}
