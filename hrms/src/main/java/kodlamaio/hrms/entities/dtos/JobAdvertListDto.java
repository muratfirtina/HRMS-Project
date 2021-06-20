package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import kodlamaio.hrms.core.entities.Dto;
import lombok.Data;

@Data
public class JobAdvertListDto implements Dto {
	
	@NotNull
	@Size(max = 100)
	private String companyName;

	@NotNull
	@Size(max = 50)
	private String title;

	
	private int numberOfOpenPositions;

	
	private LocalDateTime createdAt;

	
	private LocalDate Deadline;

}
