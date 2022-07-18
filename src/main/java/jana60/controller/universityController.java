package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jana60.modello.Universita;
import jana60.repository.UniversityRepository;


@Controller
@RequestMapping("/")
public class universityController {
	
	@Autowired 
	private UniversityRepository repo;


	@GetMapping
	public String index (Model model)
	{
		return "index";
	}
	
	@GetMapping("/department")
	public String department(Model model)
	{
		List<Universita> deptList = (List<Universita>) repo.findAll();
		model.addAttribute("deptList", deptList);
		return "department";
	}
	
	
	
}