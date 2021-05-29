package kodlamaio.hrms.mernisService;

import java.util.Date;

public class FakeMernisService {
	public boolean ValidateByPersonalInfo(String identityNumber, String firstName, String lastName, Date birthDate)
	{
		System.out.println(firstName + " " + lastName + " is valid person." );
		return true;
	}
}
