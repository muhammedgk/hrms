package kodlama.io.hrms.entities.dtos;

import java.time.LocalDate;
import java.util.List;

import kodlama.io.hrms.entities.concretes.Job;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobExperienceDto {
	private int id;
	private int cvId;
	private String workplaceName;
	private String jobId;
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalDate dateOfUpload;
}
