package DSA.recursion.lec1;

public class BinarySearch {
    static boolean binarySearch(int s, int e, int[] arr, int target){
        if(s >= e) return false;
        int m = s + (e-s)/2;
        if(arr[m] == target) return true;
        if(target < arr[m]) return binarySearch(s, m-1, arr, target);
        else return binarySearch(m+1, e, arr, target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;

        System.out.println(binarySearch(0, arr.length-1, arr, target));
    }
}
