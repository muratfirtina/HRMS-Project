package kodlamaio.hrms.core.utilities.adapters;

import java.util.Date;

public interface ValidationService {
	boolean validateByMernis(String identityNumber, String firstName, String lastName, Date birthDate);
}
