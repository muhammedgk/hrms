package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employers")
@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "employer_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class Employer extends User {

	@Column(name="company_name")
	private String companyName;
	@Column(name="web_site")
	private String website;
	@Column(name="web_site_email")
	private String websiteEmail;
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="is_verify")
	private boolean isVerify;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdverts;

}
