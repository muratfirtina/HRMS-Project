package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

public interface CompanyStaffVerification {

	DataResult<CompanyStaffVerification> getByUserId(final int userId);

	Result verify(int id);
}
