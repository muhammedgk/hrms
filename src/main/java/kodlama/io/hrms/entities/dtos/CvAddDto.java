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
	public String githubLink;
	public String linkedLink;
	private String description;
	public LocalDate releaseDate;
	public LocalDate lastUpdateDate;

}
