package Assignment5A;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class WriteToFile {
	public static void main(String[] args) {
	    try {
	        PrintWriter pw = new PrintWriter(new FileOutputStream("Info.txt"));
	        pw.println("Hello, this is line 1.");
	        pw.println("Java File I/O is interesting!");
	        pw.println("End of the assignment.");
	        pw.close();
	        System.out.println("File created successfully!");
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}



}