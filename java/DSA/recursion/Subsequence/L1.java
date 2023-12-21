package DSA.recursion.Subsequence;

import java.util.ArrayList;

public class L1 {
    
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int n = 3;
        ArrayList<Integer> ds = new ArrayList<>(); // initialize the ArrayList
        printF(0, ds, arr, n);
    }

    /*
            Time & Space Complexity of the subsequence Function in Recursion
            * TC --> O(2^n x n)
            * SC --> O(n)
    */

    private static void printF(int index, ArrayList<Integer> ds, int[] arr, int n) {
        if (index == n) {
            System.out.print("[ ");
            for (int i : ds) {
                System.out.print(i + " ");
            }
            System.out.println("]");
            return;
        }
        // take or pick the particular index into the subsequence
        ds.add(arr[index]);
        printF(index + 1, ds, arr, n);
        ds.remove(ds.size() - 1); // remove the last element from the ArrayList

        // not pick, or not take conditions, this element is not added to our subsequence
        printF(index + 1, ds, arr, n);
    }
}
