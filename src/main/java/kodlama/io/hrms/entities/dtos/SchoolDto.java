package kodlama.io.hrms.entities.dtos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SchoolDto {

	private int id;
	private int cvId;
	private String schoolName;
	private String departmant;
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalDate dateOfUpload;
	

}
