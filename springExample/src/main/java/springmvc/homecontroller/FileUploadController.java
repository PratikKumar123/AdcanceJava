package springmvc.homecontroller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showForm() {

		return "fileForm";
	}
//	@RequestMapping("/fileform/{user}")
//	public String showForm(@PathVariable("user") int userid) {
//
//		System.out.println(userid);
//		return "fileForm";
//	}

	@RequestMapping(path = "/uploadImg", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("image") CommonsMultipartFile file, HttpSession s) {

		System.out.println("file upload handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
//		byte[] d = file.getBytes();
//		String path = s.getServletContext().getRealPath("/")+file.getOriginalFilename();
//		System.out.println("path = " +path);
//		try {
//			FileOutputStream f = new FileOutputStream(path);
////			f.write(d);
//			f.close();
////			System.out.println("upload successfully");
//		} catch (Exception e) {
//			e.getMessage();
//			System.out.println("error");
//		}
		return "filesuccess";
	}
}
