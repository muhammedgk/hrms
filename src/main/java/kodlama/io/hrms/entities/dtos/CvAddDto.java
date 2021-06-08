package kodlama.io.hrms.entities.dtos;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvAddDto {
	public int id;
	public int candidateId;
	public String candidateFirstName;
	public String candidateLastName;
	public String candidateNationalId;
	public String candidateEmail;
	public String githubLink;
	public String linkedLink;
	public LocalDate releaseDate;
	public LocalDate lastUpdateDate;

}
