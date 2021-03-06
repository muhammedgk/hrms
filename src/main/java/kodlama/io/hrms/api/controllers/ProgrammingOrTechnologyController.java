package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.ProgrammingOrTechnologyService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.ProgrammingOrTechnology;
import kodlama.io.hrms.entities.dtos.ProgrammingOrTechnologyDto;

@RestController
@RequestMapping("/api/programmingOrTechnology")
public class ProgrammingOrTechnologyController {

	private ProgrammingOrTechnologyService programmingOrTechnologyService;

	@Autowired
	public ProgrammingOrTechnologyController(ProgrammingOrTechnologyService programmingOrTechnologyService) {
		super();
		this.programmingOrTechnologyService = programmingOrTechnologyService;
	}

	@GetMapping("/getAll")
	DataResult<List<ProgrammingOrTechnologyDto>> getAll() {
		return this.programmingOrTechnologyService.getAll();
	}

	@PostMapping("/add")
	Result add(@RequestBody ProgrammingOrTechnologyDto programmingOrTechnologyDto) {
		return this.programmingOrTechnologyService.add(programmingOrTechnologyDto);

	}

}
