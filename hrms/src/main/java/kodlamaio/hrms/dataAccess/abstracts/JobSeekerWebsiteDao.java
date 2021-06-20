package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerWebsite;

public interface JobSeekerWebsiteDao extends JpaRepository<JobSeekerWebsite, Integer>{
	
	List<JobSeekerWebsite> findAllByJobSeekerCV_Id(int jobSeekerCvId);

}
