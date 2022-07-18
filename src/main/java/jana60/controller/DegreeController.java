package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.modello.Degree;
import jana60.repository.DegreeRepository;


@Controller
@RequestMapping("/degree")
public class DegreeController {
	
	@Autowired
	private DegreeRepository repo;
	
	
	@GetMapping
	public String degrees(Model model)
	{
		List<Degree> degList = (List<Degree>) repo.findAll();
		model.addAttribute("degList", degList);
		return "degree";
	}

} 
