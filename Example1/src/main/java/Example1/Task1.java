package Example1;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Task1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		JSONObject obj=new JSONObject();    
		  obj.put("name","Kumar");    
		  obj.put("age",21);    
		  obj.put("salary",12000);  
		  
		  FileWriter f = new FileWriter("text.json");
		  f.write(obj.toJSONString());
		  f.close();
		  System.out.println("created");

	}

}
