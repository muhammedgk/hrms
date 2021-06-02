package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.ProgrammingOrTechnologyService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.ProgrammingOrTechnologyDao;
import kodlama.io.hrms.entities.concretes.ProgrammingOrTechnology;

@Service
public class ProgrammingOrTechnologyManager implements ProgrammingOrTechnologyService {

	private ProgrammingOrTechnologyDao programmingOrTechnologyDao;

	@Autowired
	public ProgrammingOrTechnologyManager(ProgrammingOrTechnologyDao programmingOrTechnologyDao) {
		super();
		this.programmingOrTechnologyDao = programmingOrTechnologyDao;
	}

	@Override
	public DataResult<List<ProgrammingOrTechnology>> getAll() {
		return new SuccessDataResult<List<ProgrammingOrTechnology>>(this.programmingOrTechnologyDao.findAll(),
				"Data Lİstelendi");
	}

	@Override
	public Result add(ProgrammingOrTechnology programmingOrTechnology) {
		this.programmingOrTechnologyDao.save(programmingOrTechnology);
		return new SuccessDataResult<List<ProgrammingOrTechnology>>(this.programmingOrTechnologyDao.findAll(),
				"Data Eklendi");
	}

}
