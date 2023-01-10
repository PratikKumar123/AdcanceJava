package FilesWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WrtingOnFile {

	public static void main(String[] args){
		
		File f = new File("C:/new_file/content.txt");
		
		try {
			f.createNewFile();
			System.out.println(f.exists());
			FileWriter fw = new FileWriter(f, true);
			System.out.println(f.exists());
			fw.write(87);
			fw.write("Hai\nHow are you\n");
			char[] ch1 =
			{ 'a', 'b', 'c' };
			String s = "Pratik bhatt";
			
			fw.write(ch1);
			fw.write(s);
			FileReader fr = new FileReader(f);
			
			Scanner r = new Scanner(fr);
			
			while(r.hasNextLine()) {
				String data = r.nextLine();
				System.out.println(data);
			}
			r.close();
			fw.flush();
			fw.close();

			
		} catch (IOException e) {
			
			
			e.printStackTrace();
			
		}
	}

}
