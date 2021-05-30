package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.SystemUserService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.SystemUser;

@RestController
@RequestMapping("/api/systemUser")
public class SystemUsersController {
	@Autowired
	private SystemUserService systemUserService;

	public SystemUsersController(SystemUserService systemUserService) {
		super();
		this.systemUserService = systemUserService;
	}
	
	@GetMapping(name = "/getAll")
	DataResult<List<SystemUser>> getAll(){
		return this.systemUserService.getAll();
	}
	
	@PostMapping(name= "/add")
	public Result add(@RequestBody SystemUser systemUser) {
		return this.systemUserService.add(systemUser);
	} 


}
