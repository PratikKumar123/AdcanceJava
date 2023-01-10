package json;

import org.json.simple.JSONObject;

public class Example1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj=new JSONObject();    
		  obj.put("name","sonoo");    
		  obj.put("age",2);    
		  obj.put("salary",600000);    
		   
		  System.out.print(obj);   
		
		

	}

}
