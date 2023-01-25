package springmvc.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class formHandler {
	
	@RequestMapping("/userF")
	public String showForm() {
		
		
		return "userForm";
	}
	
	@RequestMapping(path = "/handleForm", method = RequestMethod.POST)
	public String formhandler(@ModelAttribute("student") StudentForm student, BindingResult result) {
		
		if(result.hasErrors()) {
			return "userForm";
		}
		System.out.println(student);
		
		return "successForm";
	}
	

}
