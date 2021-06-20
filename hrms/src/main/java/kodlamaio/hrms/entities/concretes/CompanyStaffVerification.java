package kodlamaio.hrms.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import kodlamaio.hrms.core.entities.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "company_staff_verifications")

public class CompanyStaffVerification {
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@JoinColumn(name = "user_id")
	@OneToOne()
	private User user;

	@NotNull
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;

	@NotNull
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createdAt = LocalDateTime.now();

	@NotNull
	@Column(name = "verification_date")
	private LocalDateTime verificationDate;

	
	public CompanyStaffVerification(@NotNull final User user, @NotNull final boolean isVerified,
			@NotNull LocalDateTime verificationDate) {
		this.user = user;
		this.isVerified = isVerified;
		this.verificationDate = verificationDate;
	}
}
