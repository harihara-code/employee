package training.employee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import training.employee.model.Data;
import training.employee.model.Employee;
import training.employee.model.EmployeeRepository;

@Controller
@RequestMapping
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("add.html");
	}
	
//	@PostMapping("/addemployee")
//	public @ResponseBody String addNewEmployee(@RequestBody Employee emp) {
//		System.out.println("mapped right");
//		Employee newEmp = new Employee();
//		newEmp.setMobile(emp.getMobile());
//		newEmp.setName(emp.getName());
//		
//		return "success : 'employee added'";
//	}
	
	@PostMapping("/addemployee")
	public @ResponseBody String add(Data dataObject) {
		System.out.println("mapped rightly");
		System.out.println(dataObject);
		return "<html><body>worked</body></html>";
	}
	
	@GetMapping("/add")
	public ModelAndView add(@RequestParam String name,@RequestParam String mobile) {
//		Employee newEmployee = new Employee();
//		newEmployee.setName("Hariharan");
//		newEmployee.setMobile("123456789");
//			
//		repository.save(newEmployee);
//		System.out.println("new emploee added");
//		return "Employee added";
		return new ModelAndView("success.html");
	}
	
	@GetMapping("/all") 
	public @ResponseBody Iterable<Employee> getAllEmployees() {
		return repository.findAll();
		
	}

}

