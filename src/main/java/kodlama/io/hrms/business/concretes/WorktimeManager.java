package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.WorktimeService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.WorktimeDao;
import kodlama.io.hrms.entities.concretes.Worktime;

@Service
public class WorktimeManager implements WorktimeService {
	
	
	private WorktimeDao worktimedao;
	
	@Autowired
	public WorktimeManager(WorktimeDao worktimedao) {
		super();
		this.worktimedao = worktimedao;
	}


	@Override
	public DataResult<List<Worktime>> getAll() {
		return new SuccessDataResult<List<Worktime>>(this.worktimedao.findAll(),"Başarılı");
	}

}
