package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CompanyStaff;

public interface CompanyStaffService {

	DataResult<List<CompanyStaff>> getAll();
	DataResult<CompanyStaff> get(int id);
    Result add(CompanyStaff companyStaff);
    Result delete(CompanyStaff companyStaff);
    Result update(CompanyStaff companyStaff);
}
