package Assignment5A;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class ChallengeA {
//Implement a method that takes a filename and a String as input and writes the String to the specified file without using buffers.
//Test this method by writing a custom message to a new file named "custom.txt."
	   public static void main(String[] args) {
		
		   writeToFile("custom.txt","Hurrey, Last assignment!");
	    }
	   
	   public static void writeToFile(String filename, String input) {
		   PrintWriter pw = null;
	
	        try  {

	            pw = new PrintWriter(new FileOutputStream(filename,false));
	            pw.println(input);
	            System.out.println("Input is succefully written to " + filename+"!");
	            pw.close();
	            
	        } catch (IOException e) {
	            
	            e.printStackTrace();
	        }
	    }
}
