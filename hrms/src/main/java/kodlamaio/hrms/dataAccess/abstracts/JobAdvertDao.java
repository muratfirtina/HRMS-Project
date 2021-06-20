package kodlamaio.hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer>{

	List<JobAdvert> findAllByCity_Id(int cityId);
    List<JobAdvert> findAllByJobPosition_Id(int jobPositionId);
    List<JobAdvert> findAllByEmployer_IdAndIsActiveTrue(int employerId);
    List<JobAdvert> findAllByIsActiveTrueOrderByAdvertDeadlineDesc();
    List<JobAdvert> findAllByAdvertDeadlineLessThanEqual(LocalDate date);
}
