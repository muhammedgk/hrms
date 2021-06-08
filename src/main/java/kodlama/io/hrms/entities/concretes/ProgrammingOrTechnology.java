package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="programming_or_technology")

public class ProgrammingOrTechnology {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="programming_language_name")
	private String programmingLanguageName;
	
	@Column(name="date_of_upload")
	private LocalDate dateOfUpload=LocalDate.now();
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne(targetEntity = Cv.class)
	@JoinColumn(name="cv_id")
	private Cv cv;



}
