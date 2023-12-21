package DSA.arrays;

import java.util.ArrayList;

public class FizzBuzzStream {

    static void normalWay(int n){
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    static  void withStream(ArrayList<Integer> numbers){
        numbers.stream().forEach(number -> {
            if (number % 3 == 0 && number % 5 == 0)
                System.out.println("FizzBuzz");
            else if (number % 3 == 0)
                System.out.println("Fizz");
            else if (number % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(number);
        });
    }

    public static void main(String[] args) {
        int  n  = 100;
        ArrayList<Integer> numbers = new ArrayList<>();

        // Populate the list with numbers from 1 to 100
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }



    }
}

