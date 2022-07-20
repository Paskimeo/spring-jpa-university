package jana60.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import jana60.modello.Teacher;
import jana60.repository.TeacherRepository;

@Controller
@RequestMapping("/teacher")
public class TeachersController 
{
	@Autowired
	private TeacherRepository repo;
	
	@GetMapping
	public String teacher(Model model)
	{
		List<Teacher> TeaList = (List<Teacher>) repo.findAll();
		model.addAttribute("TeaList", TeaList);
		return "teacher";
	}

	@GetMapping("/{teacherId}")
	public String teachersDetail(Model model,
			@PathVariable(name = "teacherId") Integer teacherPrimaryKey)
	{
		Optional<Teacher> curDep = repo.findById(teacherPrimaryKey);
		if(curDep.isPresent())
		{
		model.addAttribute("teacher", curDep.get());
		return "teacherDetail";
		}
		else {
			 // se la query non ha trovato risultati rispondo con un HTTP 404
		      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Insegnante non trovato.");
		}
	}
}
