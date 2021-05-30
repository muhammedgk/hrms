package kodlama.io.hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	List<JobAdvertisement> findByIsActiveTrue();

	JobAdvertisement findById(int id);

	List<JobAdvertisement> getByApplicationDeadlineLessThanEqualAndIsActiveTrue(LocalDate date);

	@Query("From JobAdvertisement where is_active=true and employer_id=:employerId")
	List<JobAdvertisement> findByEmployer(int employerId);

}
