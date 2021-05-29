package kodlamaio.hrms.core.utilities.adapters;


import org.springframework.stereotype.Service;

import kodlamaio.hrms.mernisService.FakeMernisService;

@Service
public class MernisServiceAdapter implements ValidationService {

	@Override
	public boolean validateByMernis(String identityNumber, String firstName, String lastName, int birthDate) {

		FakeMernisService client = new FakeMernisService();
		
		boolean result = true;
		try {
			result = client.ValidateByPersonalInfo(identityNumber, firstName, lastName, birthDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
}
