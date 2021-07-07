package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.WorkplaceService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.Workplace;

@CrossOrigin
@RestController
@RequestMapping("api/workplace")
public class WorkplaceController {
	
	private WorkplaceService workplaceService;
	@Autowired
	public WorkplaceController(WorkplaceService workplaceService) {
		super();
		this.workplaceService = workplaceService;
	}
	
	@GetMapping("/getAll")
	DataResult<List<Workplace>> getAll(){
		return this.workplaceService.getAll();
	}
}
