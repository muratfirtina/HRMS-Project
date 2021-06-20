package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ExperienceCv;

public interface ExperienceCvDao extends JpaRepository<ExperienceCv, Integer> {
	
	List<ExperienceCv> findAllByJobSeekerCV_Id(int jobSeekerCVId);

	List<ExperienceCv> findAllByJobSeekerCV_IdOrderByQuitDate(int jobSeekerCVId);

	List<ExperienceCv> findAllByJobSeekerCV_IdOrderByQuitDateDesc(int jobSeekerCVId);
}
