package comm.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping(method=RequestMethod.GET,name="/showView")
	public String showHelloWorldForm() {
		return "helloWorld-form";
	}
//	@RequestMapping(method = RequestMethod.POST, name = "/processForm")
//	public String processStudentForm()
//	{
//		return "hello-world";
//	}
	@RequestMapping(name = "/processform")
	public String processStudentFormVersionThree(@RequestParam("firstName") String firstName,@RequestParam("lastname") String lastName,@RequestParam("email")String email,
			Model theModel)
	
	{
theModel.addAttribute("M", new Student(firstName,lastName,email).toString());
		return "hello-world";
	}
}
