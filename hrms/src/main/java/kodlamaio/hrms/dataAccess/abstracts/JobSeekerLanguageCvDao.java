package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerLanguageCv;

public interface JobSeekerLanguageCvDao extends JpaRepository<JobSeekerLanguageCv, Integer>{
	List<JobSeekerLanguageCv> findAllByJobSeekerCv_Id(int jobSeekerCvId);
}
