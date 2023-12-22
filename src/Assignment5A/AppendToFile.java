package Assignment5A;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileOutputStream;



public class AppendToFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			
			
			PrintWriter pw = null;
			pw = new PrintWriter(new FileOutputStream("output.txt",true));
			pw.write(System.lineSeparator());
			pw.write("Appending new line.");
			pw.write(System.lineSeparator()); 
			pw.write("File I/O without buffers.");
			pw.close();

			System.out.println("Lines appended to " + "info.txt successfully!");

		} catch (IOException e) {
	
			e.printStackTrace();
		}

	}
	
	


}
