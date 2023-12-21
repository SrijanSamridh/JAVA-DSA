package DSA.recursion;

import java.util.Arrays;

public class V4_functional {
    public static void reverse(int start, int end, int[] arr){
        if(start >= end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(++start, --end, arr);
    }

//    public static void reverse(int start, int end, String str){
//        if(start >= end) return;
//        char temp = str.charAt(start);
//        str.charAt(start) = str.charAt(end);
//        arr[end] = temp;
//        reverse(++start, --end, arr);
//    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int s = 0;
        int e = arr.length-1;
        reverse(s, e, arr);
        System.out.println(Arrays.toString(arr));
    }
}
