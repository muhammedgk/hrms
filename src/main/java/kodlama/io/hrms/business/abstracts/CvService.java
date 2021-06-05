package kodlama.io.hrms.business.abstracts;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Cv;
import kodlama.io.hrms.entities.dtos.CvDto;

public interface CvService {
	
	DataResult<List<Cv>> getAll();
	Result add(Cv cv);
	Result uploadCvPhoto(int CvId, MultipartFile multipartFile) throws IOException;

}
