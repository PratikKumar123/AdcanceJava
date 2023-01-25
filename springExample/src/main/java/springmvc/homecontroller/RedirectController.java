package springmvc.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	@RequestMapping("/one")
	public String one() {
		System.out.println("thisis one handler");
		
		return "redirect:two";
	}
	
	@RequestMapping("/two")
	public RedirectView two() {
		System.out.println("thisis second handler");
		RedirectView r = new RedirectView();
		r.setUrl("contact");
		
		return r;
	}
	
	@RequestMapping("/three")
	public String three() {
		System.out.println("thisis third handler");
		return "";
	}

	
	
}
