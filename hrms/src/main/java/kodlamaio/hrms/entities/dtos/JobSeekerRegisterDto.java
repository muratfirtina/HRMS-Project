package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import kodlamaio.hrms.core.entities.Dto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class JobSeekerRegisterDto implements Dto {

	@NotBlank
	@Email
	@Size(max = 100)
	private String email;
	
	@NotBlank
	@Size(min = 8, max = 16)
	private String password;
	
	@NotBlank
	@Size(min = 8, max = 16)
	private String confirmPassword;
	
	@NotNull
	@Size(max = 50)
	private String firstName;
	
	@NotNull
	@Size(max = 50)
	private String lastName;
	
	@NotBlank
	@Size(min = 11, max = 11)
	private String identityNumber;
	
	@NotNull
	private LocalDate birthDate;
}
