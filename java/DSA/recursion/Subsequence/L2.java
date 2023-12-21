package DSA.recursion.Subsequence;

import java.util.ArrayList;

public class L2 {

    static void printF(int index, ArrayList<Integer> ds, int s, int[] arr, int n, int sum){
        if(index == n) {
            if (s == sum) {
                for (int i : ds)
                    System.out.print(i + " ");
                System.out.println();
            }
            return;
        }
        ds.add(arr[index]);
        s += arr[index];
        printF(index+1, ds, s, arr, n, sum);
        s-=arr[index];
        ds.remove(ds.size()-1);
        //
        printF(index+1, ds, s, arr, n, sum);
    }

    static boolean printS(int index, ArrayList<Integer> ds, int s, int[] arr, int n, int sum){
        if(index == n) {
            // condition satisfied
            if (s == sum) {
                for (int i : ds)
                    System.out.print(i + " ");
                System.out.println();
                return true;
            }
            // conditions not satisfied
            return false;
        }

        ds.add(arr[index]);
        s += arr[index];
        if(printS(index + 1, ds, s, arr, n, sum)) return true;

        s-=arr[index];
        ds.remove(ds.size()-1);

        // not pick
        if(printS(index + 1, ds, s, arr, n, sum)) return true;

        return false;
    }

    static int printCount(int index, int s, int[] arr, int n, int sum){
        if(index == n){
            // condition satisfied
            if (s == sum) return 1;
            // condition not satisfied
            else return 0;
        }
        s+= arr[index];
        int left = printCount(index+1, s, arr, n, sum);

        s-=arr[index];
        int right = printCount(index+1, s, arr, n, sum);

        return left+right;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = 3;
        int sum = 2;
//        ArrayList<Integer> ds = new ArrayList<>();
        System.out.println(printCount(0,0, arr, n, sum));
    }
}
