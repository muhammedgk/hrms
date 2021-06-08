package kodlama.io.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForeignLanguageDto {
	private int id;
	private int cvId;
	private String languageName;
	private char languageLevel;
	private LocalDate dateOfUpload;

}
