package kodlama.io.hrms.api.controllers;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlama.io.hrms.business.abstracts.CvService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Cv;
import kodlama.io.hrms.entities.dtos.CvAddDto;
import kodlama.io.hrms.entities.dtos.CvGetDto;

@CrossOrigin
@RestController
@RequestMapping("/api/cv")
public class CvController {
	
	private CvService cvService ;
	@Autowired
	public CvController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	
	@GetMapping("/getAll")
	DataResult<List<CvGetDto>> getAll(){
		return this.cvService.getAll();
		
	}
	
	@PostMapping("/add")
	Result add(@RequestBody CvAddDto cvAddDto ) {
		return this.cvService.add(cvAddDto);
	}
	
	@PutMapping("update")
	Result update(@Valid @RequestBody int cvId , CvAddDto cvAddDto ) {
		return this.cvService.update(cvId,cvAddDto);
		
	}
	
	
	
	@PostMapping("/upload")
	Result upload(int cvId,MultipartFile multipartFile) throws IOException {
		return this.cvService.uploadCvPhoto(cvId, multipartFile);
	}
	@GetMapping("/findByCvId")
	DataResult<Cv> findByCvId(int id){
		return this.cvService.findById(id);
	}
			

}
