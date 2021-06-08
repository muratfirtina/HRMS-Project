package kodlamaio.hrms.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_seeker_images")
public class JobSeekerImage {

	@Column(name = "id")
	private int jobSeekerImageId;
	
	
	@Column(name = "cv_id")
	private int cvId;
	
	
	@Column(name = "url")
	private String url;
	
	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createdAt = LocalDateTime.now();
}
