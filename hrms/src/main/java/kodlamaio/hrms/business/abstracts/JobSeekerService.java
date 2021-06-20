package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.dtos.JobSeekerRegisterDto;

public interface JobSeekerService {

	Result add(JobSeeker jobSeeker);
	Result update(JobSeeker jobseeker);
	Result delete(int id);
	Result register(JobSeekerRegisterDto jobSeekerRegisterDto);
	DataResult<JobSeeker> getById(int id);
	DataResult<List<JobSeeker>> getAll();
	DataResult<JobSeeker> getByIdentityNumber(String identityNumber);
}