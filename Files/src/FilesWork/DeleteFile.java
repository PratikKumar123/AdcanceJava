package FilesWork;


import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		File f = new File("practice.txt");
		if(f.delete()) {
			System.out.println( "file deleted"+ f.getName());
		}else {
			System.out.println("failed to delete the file");
		}

	}

}
