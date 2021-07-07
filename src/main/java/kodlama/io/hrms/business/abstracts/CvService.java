package kodlama.io.hrms.business.abstracts;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Cv;
import kodlama.io.hrms.entities.dtos.CvAddDto;
import kodlama.io.hrms.entities.dtos.CvGetDto;

public interface CvService {
	
	DataResult<List<CvGetDto>> getAll();
	Result add(CvAddDto cvAddDto);
	Result update(int cvId,CvAddDto cvAddDto);
	Result uploadCvPhoto(int CvId, MultipartFile multipartFile) throws IOException;
	DataResult<Cv> findById(int id);
}
