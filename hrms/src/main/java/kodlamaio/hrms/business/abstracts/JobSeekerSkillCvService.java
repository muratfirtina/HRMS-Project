package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerSkillCv;

public interface JobSeekerSkillCvService {

	Result add(JobSeekerSkillCv programmingSkillForCV);
	Result update(JobSeekerSkillCv programmingSkillForCV);
	Result delete(int id);
	DataResult<JobSeekerSkillCv> getById(int id);	
	DataResult<List<JobSeekerSkillCv>> getAll();
	DataResult<List<JobSeekerSkillCv>> getAllByJobSeekerCv_Id(int jobSeekerCvId);
}
