import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

//        for (int j = 0; j<nums.length; j++){
//            if (j != nums[j]){
//                int correct = nums[j];
//                if (nums[correct]==nums[j]){
//                    list.add(nums[j]);
//                    list.add(j);
//                }
//            }
//        }
//         i = 0;

//         ArrayList<Integer> list = new ArrayList<>();
//        while(i< nums.length){
//            if(i+1 != nums[i]){
//                int correcte_index = nums[i] - 1;
//                if (nums[correcte_index] != nums[i]){
//                    //duplicate
//                    int temp = nums[correcte_index];
//                    nums[correcte_index] = nums[i];
//                    nums[i]  = temp;
//                }
//                else{
//                    list.add(nums[i]);
//                    i++;
//                }
//
//            }
//            else{
//                i++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(list);
//        System.out.println(miss);
        int[] nums = {7,8,9,11,12};
        System.out.println(Test1.firtsMissingPostive(nums));
    }
}
class Test1{
    static int firtsMissingPostive(int [] nums){

        int i = 0;
        while (i<nums.length){
            int correct = nums[i]-1;
            if (nums.length>nums[i]){
                if ((nums[i]>0&&nums[correct] != nums[i])){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
            }
            else{
                i++;
            }
        }
        int miss = 0;
        for(int j = 0; j< nums.length; j++){
            if ((j+1) != nums[j]  ){
                return j+1;
            }
        }
        return 0;
    }
}
