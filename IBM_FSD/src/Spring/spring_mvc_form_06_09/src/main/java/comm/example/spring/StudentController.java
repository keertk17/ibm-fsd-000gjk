package comm.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	public StudentDAO stud;
	@GetMapping("/showForm")
	public String viewPage(Model theModel)
	{
		
		Student student=new Student();
		theModel.addAttribute("student",student);
		return "student-form";
	}
	@PostMapping("/processForm")
	public String processPage(@ModelAttribute("student") Student theStudent,Model theModel)
	{	
		
		
		stud.createStudent(theStudent);
		theModel.addAttribute("tempStudent",theStudent);
		return "student-detail";
	}
}
