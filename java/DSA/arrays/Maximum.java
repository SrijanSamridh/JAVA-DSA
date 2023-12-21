package DSA.arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1,23,2,5,4};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 3,5));
    }

    private static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
    private static int maxInRange(int[] arr, int from, int to) {
        int max = Integer.MIN_VALUE;
        for (int i = from-1; i < to; i++) max = Math.max(arr[i], max);
        return max;
    }

}
