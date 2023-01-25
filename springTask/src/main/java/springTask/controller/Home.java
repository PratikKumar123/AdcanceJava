package springTask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

	@RequestMapping(path = "/home")
	public String homeview() {
		System.out.println("Home page");
		return "home";
	}
}
