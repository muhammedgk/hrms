package kodlama.io.hrms.api.controllers;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobAdvertisementService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;
import kodlama.io.hrms.entities.dtos.JobAdvertisementDto;
@CrossOrigin
@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementsController {
	
	@Autowired
	private JobAdvertisementService jobAdvertisementService;
	
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}

	@GetMapping("/getAll")
	DataResult<List<JobAdvertisementDto>> getAll() {
		return this.jobAdvertisementService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return jobAdvertisementService.add(jobAdvertisement);

	}

	@GetMapping("/findByIsActiveTrue")
	DataResult<List<JobAdvertisement>> findByIsActiveTrue() {
		return this.jobAdvertisementService.findByIsActiveTrue();

	}
//	@GetMapping(name = "/findByDate")
//	DataResult<List<JobAdvertisement>> findByDate(Date releaseDate,Date applicationDeadline){
//		return this.jobAdvertisementService.findByDate(releaseDate, applicationDeadline);
//		
//	}
	
	@GetMapping( "/findByDate")
	DataResult<List<JobAdvertisement>> getByApplicationDeadlineLessThanEqualAndIsActiveTrue(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date){
		return this.jobAdvertisementService.getByApplicationDeadlineLessThanEqualAndIsActiveTrue(date);
		
	}
	@GetMapping("/findByEmployer")
	DataResult<List<JobAdvertisement>> findByEmployer(@RequestParam int employerId){
		return this.jobAdvertisementService.findByEmployer(employerId);
		
	}
	@GetMapping("/passivateAdvert")
	public Result passivateAdvert(int id) {
		return this.jobAdvertisementService.passivateAdvert(id);
		
	}
	
//	@GetMapping("getJobAdvertisementDetails")
//	public DataResult<List<JobAdvertisementDto>> getJobAdvertisementDetails(){
//		return this.jobAdvertisementService.getJobAdvertisementDetails();
		
		
		
		
	
}
