package DSA.arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 45};

        System.out.println(Arrays.toString(arr));
//        swap(arr, 1, 3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left <= right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
