package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv")
public class Cv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "candidate_id", referencedColumnName =  "id" ,nullable = false )
	private Candidate candidate;

	@Column(name = "github_link")
	private String githubLink;

	@Column(name = "linked_link")
	private String linkedLink;

	@Column(name = "description")
	private String description;

	@Column(name = "photo")
	private String photo;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "release_date")
	private LocalDate releaseDate;

	@Column(name = "last_update_date")
	private LocalDate lastUpdateDate;

	@OneToMany(mappedBy = "cv")
	private List<ForeignLanguage> foreignLanguages;

	@OneToMany(mappedBy = "cv")
	private List<ProgrammingOrTechnology> programmingOrTechnology;

	@OneToMany(mappedBy = "cv")
	private List<School> school;

	@OneToMany(mappedBy = "cv")
	private List<JobExperience> jobExperiences;

}