package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_adverts")

public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_adverts_id")
	private int id;
	
	@NotNull(message = "İş Açıklaması Boş Bırakılamaz !!")
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "open_position")
	private int openPosition;
	
	@Column(name = "application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name = "is_active")
	private boolean isActive;

	
	@Column(name = "release_date",columnDefinition = "Date default CURRENT_DATE")
	@JsonIgnore
	private LocalDate releaseDate=LocalDate.now();

	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;

	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	

}
