package kodlamaio.hrms.entities.concretes;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_languages")
@EqualsAndHashCode
public class LanguageCv {
	
	@Column(name = "id")
	private int languageCvId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cv_id")
	private JobSeekerCv jobSeekerCv;
	
	@JoinColumn(name = "language_id")
	@ManyToOne
	private Language language;
	
	@Min(value = 1)
	@Max(value = 5)
	@Column(name = "level")
	private int level;
	

	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createdAt = LocalDateTime.now();
	
	
	
}
