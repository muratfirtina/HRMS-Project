package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.PastOrPresent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_educations")
public class EducationCv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int educationId;
	
	@ManyToOne
	@JoinColumn(name = "cv_id")
	private JobSeekerCv jobSeekerCv;
	
	
	@Column(name = "school_name")
	private String schoolName;
	
	
	@Column(name = "department_name")
	private String departmentName;
	
	@PastOrPresent
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@PastOrPresent
	@Column(name = "graduation_date")
	private LocalDate graduationDate;
	
	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createdAt = LocalDateTime.now();
	
	
}
