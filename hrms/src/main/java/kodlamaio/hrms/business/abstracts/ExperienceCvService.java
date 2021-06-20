package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ExperienceCv;

public interface ExperienceCvService {

	Result add(ExperienceCv experienceCv);
	Result update(ExperienceCv experienceCv);
	Result delete(int id);
	DataResult<ExperienceCv> getById(int id);	
	DataResult<List<ExperienceCv>> getAll();
	DataResult<List<ExperienceCv>> getAllByJobSeekerCv_Id(int jobSeekerCvId);
	DataResult<List<ExperienceCv>> getAllByJobSeekerCv_IdOrderByQuitDate(int jobSeekerCvId,
			Direction direction);
}
