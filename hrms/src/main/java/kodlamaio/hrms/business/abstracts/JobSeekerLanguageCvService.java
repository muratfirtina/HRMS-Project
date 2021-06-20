package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerLanguageCv;

public interface JobSeekerLanguageCvService {
	
	Result add(JobSeekerLanguageCv jobSeekerLanguageCv);
	Result update(JobSeekerLanguageCv jobSeekerLanguageCv);
	Result delete(int id);
	DataResult<JobSeekerLanguageCv> getById(int id);	
	DataResult<List<JobSeekerLanguageCv>> getAll();
	DataResult<List<JobSeekerLanguageCv>> getAllByJobSeekerCv_Id(int jobSeekerCvId);
}
