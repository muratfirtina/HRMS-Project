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
@Table(name = "cv_skills")
public class SkillCv {
	
	@Column(name = "id")
	private int skillId;
	
	
	@Column(name = "cv_id")
	private int cvId;
	
	
	@Column(name = "skill_name")
	private String schoolName;
	
	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createdAt = LocalDateTime.now();
}
