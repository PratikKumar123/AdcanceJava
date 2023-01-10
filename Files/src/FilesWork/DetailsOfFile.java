package FilesWork;

import java.io.File;

public class DetailsOfFile {

	public static void main(String[] args) {
		File f = new File("practice.txt");
		
	    if (f.exists()) {
	      System.out.println(f.getName());
	      System.out.println(f.getAbsolutePath());
	      System.out.println(f.canWrite());
	      System.out.println(f.canRead());
	      System.out.println(f.length());
	    }
	    
	    else {
	      System.out.println("The file does not exist.");
	    }

	}

}
