package Assignment5;

import java.util.ArrayList;

import Assignment5.GenericClass.Pair;

public class Challange {
	public static void printArrayList(ArrayList<?> list) {
		for (Object element : list) {
			if (element instanceof Pair) {
			
				System.out.println(element.toString());
			} else {
			
				System.out.println(element);
			}
		}
	}

	public static void main(String[] args) {
	
		ArrayList<String> wordList = new ArrayList<>();
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("orange");
		wordList.add("grape");
		wordList.add("kiwi");

		Pair<Integer, String> pair1 = new Pair<>(12345678, "TIRED SO TIRED!");
		Pair<Double, Double> pair2 = new Pair<>(7.57, 2.9999);
		ArrayList<Pair<?, ?>> pairList = new ArrayList<>();
		pairList.add(pair1);
		pairList.add(pair2);

		System.out.println("Printing wordList:");
		printArrayList(wordList);

		System.out.println("\nPrinting pairList:");
		printArrayList(pairList);
	}
}
