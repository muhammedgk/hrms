package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.SystemUserService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.SystemUserDao;
import kodlama.io.hrms.entities.concretes.SystemUser;
@Service
public class SystemUserManager implements SystemUserService {
	@Autowired
	private SystemUserDao systemUserDao;

	public SystemUserManager(SystemUserDao systemUserDao) {
		super();
		this.systemUserDao = systemUserDao;
	}

	@Override
	public DataResult<List<SystemUser>> getAll() {
		return new SuccessDataResult<List<SystemUser>>(this.systemUserDao.findAll(),"Data Lİstelendi");
		
	}

	@Override
	public Result add(SystemUser systemUser) {
		this.systemUserDao.save(systemUser);
		return new SuccessDataResult<List<SystemUser>>(this.systemUserDao.findAll(),"Sistem Kullanıcısı Eklendi");
	}

	@Override
	public Result update(int id, SystemUser systemUser) {
		this.systemUserDao.getOne(id);
		systemUser.setFirstName(systemUser.getFirstName());
		systemUser.setLastName(systemUser.getLastName());
		systemUser.setEmail(systemUser.getEmail());
		systemUser.setPassword(systemUser.getPassword());
		this.systemUserDao.save(systemUser);
		return new SuccessResult("Başarılı");
	}

}
