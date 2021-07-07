package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Worktime;

public interface WorktimeDao extends JpaRepository<Worktime, Integer>{

}
