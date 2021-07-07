package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.WorktimeService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.Worktime;

@CrossOrigin
@RestController
@RequestMapping("api/worktime")
public class WorktimeController {

	
	private WorktimeService worktimeService;
	@Autowired
	public WorktimeController(WorktimeService worktimeService) {
		super();
		this.worktimeService = worktimeService;
	}
	
	
	@GetMapping("/getAll")
	DataResult<List<Worktime>> getAll(){
		return this.worktimeService.getAll();
	}
}
