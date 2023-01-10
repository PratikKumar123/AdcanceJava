package json;

public class Student {
	
	String name;
	String empID;
	String location;
	public Student(String name, String empID, String location) {
		super();
		this.name = name;
		this.empID = empID;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
