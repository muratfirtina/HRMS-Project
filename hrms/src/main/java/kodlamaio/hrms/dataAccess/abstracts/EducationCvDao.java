package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EducationCv;

public interface EducationCvDao extends JpaRepository<EducationCv, Integer>{

	List<EducationCv> findAllByJobSeekerCV_Id(int jobSeekerId);

	List<EducationCv> findAllByJobSeekerCV_IdOrderByGraduationDate(int jobSeekerCVId);

	List<EducationCv> findAllByJobSeekerCV_IdOrderByGraduationDateDesc(int jobSeekerCVId);
}
