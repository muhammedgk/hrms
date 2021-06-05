package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.hrms.entities.concretes.Cv;
import kodlama.io.hrms.entities.dtos.CvDto;

public interface CvDao extends JpaRepository<Cv, Integer> {
	
	
	
//	@Query("Select new kodlama.io.hrms.entities.dtos.CvDto"
//			+ "(c.firstName,c.lastName,c.nationalId,u.email,z.githubLink,z.linkedLink,z.releaseDate,z.lastUpdateDate)"
//			+ " From User u,Candidate c,Cv z")
//	List<CvDto> getCvDetails();
	
	
	
	

}
