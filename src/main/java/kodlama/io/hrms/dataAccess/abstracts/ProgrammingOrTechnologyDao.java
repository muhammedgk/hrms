package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.ProgrammingOrTechnology;

public interface ProgrammingOrTechnologyDao extends JpaRepository<ProgrammingOrTechnology, Integer> {

}
