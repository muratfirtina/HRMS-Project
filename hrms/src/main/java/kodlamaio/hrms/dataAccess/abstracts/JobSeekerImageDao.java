package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerImage;

public interface JobSeekerImageDao extends JpaRepository<JobSeekerImage, Integer>{

	JobSeekerImage getByJobSeeker_Id(int jobSeekerId);
}
