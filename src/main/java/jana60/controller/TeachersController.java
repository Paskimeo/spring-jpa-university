package jana60.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


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
		Teacher curDep = repo.findById(teacherPrimaryKey).get();
		model.addAttribute("teacher", curDep);
		return "teacherDetail";
	}
}
