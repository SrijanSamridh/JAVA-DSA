package DSA.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Initializing the array in the Arraylist since the that is null
        for (int i = 0; i < 3; i++) {
            matrix.add(new ArrayList<Integer>()); // we can also put (new ArrayList<>()); like this ..
        }

        // Input
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < 3; j++) {
                matrix.get(i).add(sc.nextInt());
            }
        }

        // print
        System.out.println(matrix);
    }
}
