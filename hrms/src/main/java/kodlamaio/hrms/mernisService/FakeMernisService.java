package kodlamaio.hrms.mernisService;


public class FakeMernisService {
	public boolean ValidateByPersonalInfo(String identityNumber, String firstName, String lastName, int birthDate)
	{
		System.out.println(firstName + " " + lastName + " doğrulandı." );
		return true;
	}
}
