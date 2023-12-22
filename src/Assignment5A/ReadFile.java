package Assignment5A;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
	
		String filePath = "info.txt";
		readFile(filePath);

	}

	  public static void readFile(String filePath) {
	        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
	            Scanner scanner = new Scanner(fileInputStream);

	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	                System.out.println("Total characters: " + countCharacters(line));
	            }
	            scanner.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	private static int countCharacters(String text) {
		int count = 0;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) != ' ') {
				count++;
			}
		}

		return count;
	}
}
