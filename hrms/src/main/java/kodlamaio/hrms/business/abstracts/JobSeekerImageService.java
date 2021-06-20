package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerImage;

public interface JobSeekerImageService {
	
	Result add(JobSeekerImage jobSeekerImage, MultipartFile imageFile);
	Result update(JobSeekerImage jobSeekerImage);
	Result delete(int id);
	DataResult<JobSeekerImage> getById(int id);	
	DataResult<List<JobSeekerImage>> getAll();
	DataResult<JobSeekerImage> getByJobSeekerId(int id);
	DataResult<List<JobSeekerImage>> getAllByJobSeekerCv_Id(int jobSeekerCvId);
}
