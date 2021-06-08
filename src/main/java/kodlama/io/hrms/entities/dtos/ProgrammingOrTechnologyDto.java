package kodlama.io.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingOrTechnologyDto {
	private int id;
	private int cvId;
	private String programmingLanguageName;
	private LocalDate dateOfUpload;

}
