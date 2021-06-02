package kodlama.io.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {
	
	
	public String firstName;
	public String lastName;
	public String nationalId;
	public String email;
	public String githubLink;
	public String linkedLink;
	public LocalDate releaseDate;
	public LocalDate lastOfUpdate;

}
