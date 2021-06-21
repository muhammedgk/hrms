package kodlama.io.hrms.business.concretes;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlama.io.hrms.business.abstracts.CvService;
import kodlama.io.hrms.core.utilities.cloudinary.CloudinaryService;
import kodlama.io.hrms.core.utilities.dtoConverter.DtoConverterService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.CvDao;
import kodlama.io.hrms.entities.concretes.Cv;
import kodlama.io.hrms.entities.dtos.CvAddDto;
import kodlama.io.hrms.entities.dtos.CvGetDto;

@Service
public class CvManager implements CvService {

	private CvDao cvDao;
	private CloudinaryService cloudinaryService;
	private DtoConverterService dtoConverterService;

	@Autowired
	public CvManager(CvDao cvDao,CloudinaryService cloudinaryService,DtoConverterService dtoConverterService) {
		super();
		this.cvDao = cvDao;
		this.cloudinaryService=cloudinaryService;
		this.dtoConverterService=dtoConverterService;
	}

	@Override
	public DataResult<List<CvGetDto>> getAll() {
		return new SuccessDataResult<List<CvGetDto>>
		(dtoConverterService.dtoConverter(this.cvDao.findAll(), CvGetDto.class),"Data Listelendi");
	}

	@Override
	public Result add(CvAddDto cvAddDto) {
		this.cvDao.save((Cv) this.dtoConverterService.dtoClassConverter(cvAddDto, Cv.class));
		return new SuccessResult("Data Eklendi");
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
