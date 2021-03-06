package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	    DataResult<List<JobPosition>> getAll();
	    DataResult<JobPosition> getByJobTitle(String title);
	    DataResult<JobPosition> getById(int id);
	    Result add(JobPosition jobPosition);
	    Result delete(JobPosition jobPosition);
	    Result update(JobPosition jobPosition);
}
