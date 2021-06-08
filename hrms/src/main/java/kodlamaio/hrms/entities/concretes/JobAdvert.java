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
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_adverts")
public class JobAdvert {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobAdvertId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "number_of_open_positions")
	private int numberOfOpenPosition;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "deadline")
	private LocalDate deadline;
	
	@Column(name = "is_active", columnDefinition = "boolean default true")
	private boolean isActive = true;
	
	@Column(name="is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;
	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_TIMESTAMP")
	private LocalDateTime createdAt = LocalDateTime.now();
	
	@Column(name = "")
	private LocalDate publishedAt;
	
	@NotNull
	@JoinColumn(name = "employer_id")
	@ManyToOne()
	private Employer employer;

	@NotNull
	@JoinColumn(name = "job_position_id")
	@ManyToOne()
	private JobPosition jobPosition;

	@NotNull
	@JoinColumn(name = "city_id")
	@ManyToOne()
	private City city;
	
	
}
