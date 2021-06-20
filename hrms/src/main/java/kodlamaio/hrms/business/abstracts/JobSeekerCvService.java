package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerCv;

public interface JobSeekerCvService {

	Result add(JobSeekerCv jobSeekerCv);
	Result update(JobSeekerCv jobSeekerCv);
	Result delete(int id);
	DataResult<JobSeekerCv> getByJobSeeker_Id(int jobSeekerId);
	
}
