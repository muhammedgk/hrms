package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.SchoolService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.SchoolDao;
import kodlama.io.hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService{
	
	private SchoolDao schoolDao;
@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<List<School>> getAll() {
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll(),"Data Lİstelendi");
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll(),"Data Eklendi");
	}

}
