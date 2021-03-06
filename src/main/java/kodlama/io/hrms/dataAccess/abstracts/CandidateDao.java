package kodlama.io.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Candidate;


public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	Candidate findByNationalId(String nationalId);
	Candidate findByEmail(String email);
	Candidate findByCandidateId(int id) ;
}
