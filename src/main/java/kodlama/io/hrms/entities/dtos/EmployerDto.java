package kodlama.io.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployerDto {
	
	private int id;
	private String companyName;
	private String website;
	private String websiteEmail;
	private String phoneNumber;
	private String userPassword;
	private boolean isVerify;

}
