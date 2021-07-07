package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.WorkplaceService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.WorkplaceDao;
import kodlama.io.hrms.entities.concretes.Workplace;


@Service
public class WorkplaceManager implements WorkplaceService{
	
	
	private WorkplaceDao workplaceDao;
	@Autowired
	public WorkplaceManager(WorkplaceDao workplaceDao) {
		super();
		this.workplaceDao = workplaceDao;
	}

	@Override
	public DataResult<List<Workplace>> getAll() {
		return new SuccessDataResult<List<Workplace>>(this.workplaceDao.findAll(),"Başarılı");
	}

}
