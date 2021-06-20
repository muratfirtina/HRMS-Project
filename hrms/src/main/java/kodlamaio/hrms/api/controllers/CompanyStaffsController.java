package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CompanyStaffService;
import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.CompanyStaff;
import kodlamaio.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class CompanyStaffsController {

	private CompanyStaffService companyStaffService;

	@Autowired
	public CompanyStaffsController(CompanyStaffService companyStaffService) {
		super();
		this.companyStaffService = companyStaffService;
	}
	

//	@PostMapping("/add")
//	public Result add(@RequestBody Employee employee){
//		return this.employeeService.add(employee);
//	}
//	
//	@PostMapping("/update")
//	public Result update(@RequestBody Employee employee){
//		return this.employeeService.update(employee);
//	}
//	
//	@PostMapping("/delete")
//	public Result delete(@PathVariable("id") int id){
//		return this.employeeService.delete(id);
//	}
//	
//	@GetMapping("/getbyid")
//	public DataResult<Employee> getById(@PathVariable("id") int id){
//		return this.employeeService.getById(id);
//	}
	
	@GetMapping("/getall")
	public DataResult<List<CompanyStaff>> getAll(){
		return this.companyStaffService.getAll();
	}
}
