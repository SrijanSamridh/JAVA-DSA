package DSA.arrays;

import java.util.Arrays;

public class array2D {
    public static void main(String[] args){
        int[][] arr = new int[3][4];
        // assignind values to the array
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j + 1;
            }
        }

        // printing the array
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
