import java.util.Arrays;
import java.util.Random;

//import static sun.security.ssl.Utilities.swap;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 2, 1, 3};
        String str = "LEETCODE";
        int i = 0;
         str = str.toLowerCase();
        System.out.println(str);
        String arr = "";
        while(nums.length>i){
            int correct_index = nums[i];
            if (nums[correct_index] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
                char k = str.charAt(correct_index);
            }
            else if(nums[i]==i){
                char k = str.charAt(correct_index);
                arr = arr + k;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(arr);
//        char j = str.charAt(0);
//        char k = str.charAt(1);
//        str.replace(0,1);
        System.out.println(str);
    }

//    public static void shuffle(int[] nums) {
//        Random rand = new Random();
//        for (int i = nums.length - 1; i > 0; i--) {
//            int j = rand.nextInt(i + 1);
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//        }
//    }


}
