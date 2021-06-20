package kodlamaio.hrms.entities.concretes;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "job_seeker_cvs")
public class JobSeekerCv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int jobSeekerCvId;
	
	@OneToOne()
	@Column(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	@Column(name = "cover_letter")
	private String coverLetter;
	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createdAt = LocalDateTime.now();
	
	@JsonIgnore()
	@OneToMany(mappedBy = "jobSeekerCV")
	private List<JobSeekerLanguageCv> languageCvs;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "jobSeekerCv" )
	private List<EducationCv> educationCvs;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "jobSeekerCV")
	private List<ExperienceCv> experienceCvs;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "jobSeekerCV")
	private List<JobSeekerSkillCv> skillCvs;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "jobSeekerCV")
	private List<JobSeekerWebsite> jobSeekerWebsites;
	
	@JsonIgnore()
	@OneToOne(mappedBy = "jobSeekerCV" , optional = false, fetch=FetchType.LAZY)
	private JobSeekerImage jobSeekerImage;
	
	
	
}
