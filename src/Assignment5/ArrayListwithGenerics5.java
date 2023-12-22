package Assignment5;
import java.util.ArrayList;
public class ArrayListwithGenerics5 {
	public static class Pair<T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public void printPair() {
            System.out.println("Pair: (" + first + ", " + second + ")");
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList of Pair instances
        ArrayList<Pair<?, ?>> pairList = new ArrayList<>();

        // Add Pair<Integer, String> instance
        Pair<Integer, String> pair = new Pair<>(12345678, "TIRED SO TIRED!");
        pairList.add(pair);

        // Add Pair<Double, Double> instance
        Pair<Double, Double> doublePair = new Pair<>(7.57, 2.9999);
        pairList.add(doublePair);

        // Print the elements of each Pair in the ArrayList
        for (Pair<?, ?> pairItem : pairList) {
            pairItem.printPair();
        }
    }
}

