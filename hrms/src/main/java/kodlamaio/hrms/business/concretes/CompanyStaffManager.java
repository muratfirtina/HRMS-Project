package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CompanyStaffService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CompanyStaffDao;
import kodlamaio.hrms.entities.concretes.CompanyStaff;


@Service
public class CompanyStaffManager implements CompanyStaffService{

	private CompanyStaffDao companyStaffDao;
	
	@Autowired
	public CompanyStaffManager(CompanyStaffDao companyStaffDao) {
		this.companyStaffDao = companyStaffDao;
	}

	@Override
	public DataResult<List<CompanyStaff>> getAll() {
		return new SuccessDataResult<List<CompanyStaff>>(this.companyStaffDao.findAll());
	}

	@Override
	public DataResult<CompanyStaff> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(CompanyStaff companyStaff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(CompanyStaff companyStaff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(CompanyStaff companyStaff) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
