package kodlamaio.hrms.entities.concretes;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_seeker_cvs")
public class JobSeekerCv {
	
	@Column(name = "id")
	private int jobSeekerCvId;
	
	@Column(name = "job_seeker_id")
	private int jobSeekerId;
	
	@Column(name = "cover_letter")
	private String coverLetter;
	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createdAt = LocalDateTime.now();
	
	@JsonIgnore()
	@OneToMany(mappedBy = "jobSeekerCV")
	private List<LanguageCv> languageCvs;
}
