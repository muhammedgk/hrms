package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.ProgrammingOrTechnologyService;
import kodlama.io.hrms.core.utilities.dtoConverter.DtoConverterService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.ProgrammingOrTechnologyDao;
import kodlama.io.hrms.entities.concretes.ProgrammingOrTechnology;
import kodlama.io.hrms.entities.dtos.ProgrammingOrTechnologyDto;

@Service
public class ProgrammingOrTechnologyManager implements ProgrammingOrTechnologyService {

	private ProgrammingOrTechnologyDao programmingOrTechnologyDao;
	private DtoConverterService dtoConverterService;

	@Autowired
	public ProgrammingOrTechnologyManager(ProgrammingOrTechnologyDao programmingOrTechnologyDao,DtoConverterService dtoConverterService) {
		super();
		this.programmingOrTechnologyDao = programmingOrTechnologyDao;
		this.dtoConverterService=dtoConverterService;
	}

	@Override
	public DataResult<List<ProgrammingOrTechnologyDto>> getAll() {
		return new SuccessDataResult<List<ProgrammingOrTechnologyDto>>(dtoConverterService.dtoConverter(this.programmingOrTechnologyDao.findAll(),ProgrammingOrTechnologyDto.class));
	}

	@Override
	public Result add(ProgrammingOrTechnologyDto programmingOrTechnologyDto) {
		this.programmingOrTechnologyDao.save((ProgrammingOrTechnology) this.dtoConverterService.dtoClassConverter(programmingOrTechnologyDto, ProgrammingOrTechnology.class));
		return new SuccessResult("Data Eklendi");
	}

}
