package kodlama.io.hrms.entities.dtos;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {
	
	private String companyName;
	private  String jobName;
	private int openPosition;
	private LocalDate releaseDate;
	private LocalDate applicationDeadline;
	private String jobDescription;
	

	

}
