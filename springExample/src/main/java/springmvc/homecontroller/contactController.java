package springmvc.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.mode.User;
import springmvc.service.UserService;

@Controller
public class contactController {
	
	@Autowired
	private UserService users;
	
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header", "Pratik here");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m1) {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User u , Model m2) {
		
		System.out.println(u);
		if(u.getName().isBlank()) {
			return "redirect:contact";
		}
		m2.addAttribute("user", u);
		int id = this.users.createUser(u);
		m2.addAttribute("msg","User created with "+id);
		return "success";
	}
}









/*

@RequestMapping(path = "/processform", method = RequestMethod.POST)
public String handleForm(
		@RequestParam("email") String email,
		@RequestParam("name") String name,
		@RequestParam("password") String password , Model m ) {
	
	System.out.println(email);
	System.out.println(name);
	System.out.println(password);
	
	
	user u = new user();
	user.seEmail
	user.setName
	user.setPass
	m.addSttribute("user",user);
	m.addAttribute("email", email);
	m.addAttribute("name", name);
	m.addAttribute("password", password);
	
	return "success";
}




*/






