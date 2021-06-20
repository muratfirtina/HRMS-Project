package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerSkillCv;

public interface JobSeekerSkillCvDao extends JpaRepository<JobSeekerSkillCv, Integer> {
	List<JobSeekerSkillCv> findAllByJobSeekerCV_Id(int jobSeekerCvId);

}
