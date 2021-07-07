package kodlama.io.hrms.entities.dtos;

import java.time.LocalDate;
import java.util.List;


import kodlama.io.hrms.entities.concretes.ForeignLanguage;
import kodlama.io.hrms.entities.concretes.JobExperience;
import kodlama.io.hrms.entities.concretes.ProgrammingOrTechnology;
import kodlama.io.hrms.entities.concretes.School;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvGetDto {
	
	public int id;
	public int candidateId;
	public String candidateFirstName;
	public String candidateLastName;
	public String candidateNationalId;
	public String candidateEmail;
	public String candidateBirthYear;
	public String githubLink;
	public String linkedLink;
	private String photo;
	private String description;
	public LocalDate releaseDate;
	public LocalDate lastUpdateDate;
	private List<JobExperience> jobExperiences;
	private List<ForeignLanguage> foreignLanguages;
	private List<ProgrammingOrTechnology> programmingOrTechnology;
	private List<School> school;

}
