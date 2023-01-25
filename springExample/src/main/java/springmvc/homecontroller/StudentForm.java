package springmvc.homecontroller;

import java.util.List;

public class StudentForm {

	private String name;
	private String email;
	private String password;
	private String courses;
	private List<String> skills;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "StudentForm [name=" + name + ", email=" + email + ", password=" + password + ", courses=" + courses
				+ ", skills=" + skills + "]";
	}
	
	
}
