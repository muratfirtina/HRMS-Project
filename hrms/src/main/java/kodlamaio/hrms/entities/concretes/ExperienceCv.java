package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.PastOrPresent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_experiences")
public class ExperienceCv {
	
	@Column(name = "id")
	private int experienceId;
	
	
	@Column(name = "cv_id")
	private int cvId;
	
	@Column(name = "job_position_id")
	private int jobPositionId;
	
	
	@Column(name = "workplace_name")
	private String schoolName;
	
	
	@PastOrPresent
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@PastOrPresent
	@Column(name = "quit_date")
	private LocalDate quitDate;
	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createdAt = LocalDateTime.now();
	
	
}
