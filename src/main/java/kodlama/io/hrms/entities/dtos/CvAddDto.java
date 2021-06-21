package kodlama.io.hrms.entities.dtos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvAddDto {
	@JsonProperty(access = Access.READ_ONLY)
	public int id;
	public int candidateId;
	public String githubLink;
	public String linkedLink;
	public LocalDate releaseDate;
	public LocalDate lastUpdateDate;

}
