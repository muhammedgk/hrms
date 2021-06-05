package kodlama.io.hrms.business.concretes;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlama.io.hrms.business.abstracts.CvService;
import kodlama.io.hrms.core.utilities.cloudinary.CloudinaryService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.CvDao;
import kodlama.io.hrms.entities.concretes.Cv;
import kodlama.io.hrms.entities.dtos.CvDto;

@Service
public class CvManager implements CvService {

	private CvDao cvDao;
	private CloudinaryService cloudinaryService;

	@Autowired
	public CvManager(CvDao cvDao,CloudinaryService cloudinaryService) {
		super();
		this.cvDao = cvDao;
		this.cloudinaryService=cloudinaryService;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(), "Data Eklendi");
	}

	

	@Override
	public Result uploadCvPhoto(int CvId, MultipartFile multipartFile) throws IOException {

		var result = this.cloudinaryService.upload(multipartFile);

		var url = result.get("url");

		Cv ref = this.cvDao.getOne(CvId);

		ref.setPhoto(url.toString());

		this.cvDao.save(ref);

		return new SuccessResult(" -> İşlem Başarılı!");
	}

}
