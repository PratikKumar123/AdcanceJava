package springmvc.homecontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model m) {
		
		System.out.println("this is home url");
		m.addAttribute("name","Pratik bhatt");
		
		List<String> names = new ArrayList<String>();
		names.add("pratik");
		names.add("bhattt");
		names.add("Suman");
		
		m.addAttribute("f",names);
		return "index";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView m = new ModelAndView();
		m.addObject("name","Pratik");
		m.addObject("rollno",24982);
		m.addObject("newname","Suman hati");
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		m.addObject("marks",l);
		
		m.setViewName("help");
		return m;
		
	}
}