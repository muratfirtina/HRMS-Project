package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerWebsite;

public interface JobSeekerWebsiteService {

	Result add(JobSeekerWebsite jobSeekerWebsite);
	Result update(JobSeekerWebsite jobSeekerWebsite);
	Result delete(int id);
	DataResult<JobSeekerWebsite> getById(int id);	
	DataResult<List<JobSeekerWebsite>> getAll();
	DataResult<List<JobSeekerWebsite>> getAllByJobseekerId(int id);
	DataResult<List<JobSeekerWebsite>> getAllByJobSeekerCv_Id(int jobSeekerCvId);
}
