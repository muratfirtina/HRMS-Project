package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EducationCv;

public interface EducationCvService {

	Result add(EducationCv educationCv);
	Result update(EducationCv educationCv);
	Result delete(int id);
	DataResult<EducationCv> getById(int id);	
	DataResult<List<EducationCv>> getAll();
	DataResult<List<EducationCv>> getAllByJobSeekerCv_IdOrderByGraduationDate(int jobSeekerCvId);
	DataResult<List<EducationCv>> getAllByJobseekerId(int id);
}
