package kodlama.io.hrms.entities.dtos;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {
	
	private int id;
	private String employerCompanyName;
	private  String jobName;
	private int openPosition;
	private String jobDescription;
	private int minSalary;
	private int maxSalary;
	private boolean active;
	private LocalDate releaseDate;
	private LocalDate applicationDeadline;
	
	

	

}
