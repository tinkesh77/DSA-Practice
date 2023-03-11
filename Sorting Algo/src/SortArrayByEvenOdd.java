import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArrayByEvenOdd {
    public static void main(String[] args) {
        int nums[] = {4,2,5,7};
//        for(int  i = 1 ;i< nums.length-1; i++){
//            int x = nums[i];
//            int j = i-1;
//            while(x%2==0 && j>=0){
//                nums[j+1] = nums[j];
//                j--;
//            }
//            nums[j+1] = x;
//        }
//        for(int i = 0; i<nums.length; i++){
//            if(nums[i]%2==0){
//                int temp = nums[i];
//                nums[i] = nums[i+1];
//                nums[i+1] = temp;
//            }
//        }
//        int k = 0;
//        for (int i = 0; i< nums.length; i++){
//            if (nums[i]%2==0){
//                int temp = nums[i];
//                nums[i] = nums[k];
//                nums[k] = temp;
//                k++;
//            }
//        }

        // Part 2

        int k = 1;
        for (int i = 0; i< nums.length; i = i +2){
            while(nums[i]%2 != 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k = k + 2;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
