package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Website;

public interface WebsiteService {

	Result add(Website website);
	Result update(Website website);
	Result delete(int id);
	DataResult<List<Website>> getAll();
	DataResult<Website> getById(int id);
	DataResult<Website> getByName(String name);
}
