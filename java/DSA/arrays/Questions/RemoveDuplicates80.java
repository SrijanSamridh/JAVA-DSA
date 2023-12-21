package DSA.arrays.Questions;

import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates80 {
        public static int removeDuplicates(int[] nums) {
                int n = nums.length;
                int cnt = 0, left = 0, right;
                for(right = 0; right < n; right++){
                        if(nums[right] == nums[left] && cnt < 1)
                                cnt++;
                        else if(nums[right] != nums[left]){
                                left += cnt;
                                left++;
                                nums[left] = nums[right];
                                cnt = 0;
                        }
                }
                if(left != right-1 && nums[right-1] == nums[left]){
                        left++;
                        nums[left] = nums[right - 1];
                        if(left+1 == right){
                                left--;
                        }
                }
                return ++left;
        }
        public static int removeDuplicates2(int[] nums) {
                int n = nums.length;
                if (n <= 2) {
                        return n;
                }

                int left = 2; // Starting from the third element
                for (int right = 2; right < n; right++) {
                        if (nums[right] != nums[left - 1] || nums[right] != nums[left - 2]) {
                                nums[left] = nums[right];
                                left++;
                        }
                }

                return left;
        }

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                int[] nums = {1,1,2,3,4}; // 0,0,1,1,1,1,2,3,3,3
                System.out.println(Arrays.toString(nums));
                int n = removeDuplicates2(nums);

                for (int i = 0; i < n; i++) {
                        System.out.print(nums[i] + " ");
                }
        }
}
