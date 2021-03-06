package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.SchoolService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.School;
import kodlama.io.hrms.entities.dtos.SchoolDto;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {

	private SchoolService schoolService;

	@Autowired
	public SchoolsController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}

	@GetMapping("/getAll")
	DataResult<List<SchoolDto>> getAll() {
		return this.schoolService.getAll();
	}

	@PostMapping("/add")
	Result add( @RequestBody SchoolDto schoolDto) {
		return this.schoolService.add(schoolDto);
	}

}
