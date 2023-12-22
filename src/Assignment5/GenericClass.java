package Assignment5;
import java.util.ArrayList;

public class GenericClass {
    public static class Pair<T, U> {
        private T a;
        private U p;

        public Pair(T x, U y) {
            a = x;
            p = y;
        }
        
        public String printPair() {
            return ("(" + a + ", " + p + ")");
        }
        
        public String toString() {
            return "(" + a+ ", " + p + ")";
        }


    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(12345678, "TIRED SO TIRED!");
        Pair<Double, Double> pair2 = new Pair<>(12345678.5, 23.45);  
        Pair<Pair<Integer, String>, Pair<Double, Double>> pair3 = new Pair<>(pair1, pair2);

        System.out.println("Pair is: "+pair1.printPair());
        System.out.println("Pair is: "+pair2.printPair());
        System.out.println("First element of Pair is "+pair3.a.printPair()+"; second element is " + pair3.p.printPair());  // Print inner pair 1
        
        
    }

}

