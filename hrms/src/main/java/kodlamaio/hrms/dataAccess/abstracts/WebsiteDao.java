package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Website;

public interface WebsiteDao extends JpaRepository<Website, Integer> {

	Website findByName(String name);
}
