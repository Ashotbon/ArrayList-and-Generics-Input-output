package Assignment5;
import java.util.ArrayList;

public class ArrayListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> wordList = new ArrayList<String>();

		wordList.add("apple");
		wordList.add("banana");
		wordList.add("orange");
		wordList.add("grape");
		wordList.add("kiwi");

		System.out.println(wordList);
		wordList.add(0,"pear");
		System.out.println(wordList);
		wordList.remove(2);
		boolean Orange = wordList.contains("orange");
		System.out.println("Does wordList contain 'orange'? " + Orange);
		System.out.println(wordList);
		System.out.print("Updated wordList: ");
		for (String word : wordList) {
			System.out.print(word+" ");
		}

	}
}