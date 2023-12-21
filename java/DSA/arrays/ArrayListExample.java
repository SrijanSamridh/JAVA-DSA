package DSA.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // syntax for arraylist
        ArrayList<Integer> list = new ArrayList<>(5);
        System.out.print("Enter the 6 Elements of the array: ");
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // does the object contains in the arraylist
        System.out.println(list.contains(50));
    }
}
