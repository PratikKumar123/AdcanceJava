package FilesWork;

import java.io.File;
import java.io.IOException;

public class Create {
	public static void main(String[] args) throws IOException {

	      File f = new File("C:/new_file/content.txt");
	      
	      if (f.createNewFile()) {
	        System.out.println("File created:");
	      } 
	      else {
	        System.out.println("File already exists.");
	      }
	      

	  }
}
