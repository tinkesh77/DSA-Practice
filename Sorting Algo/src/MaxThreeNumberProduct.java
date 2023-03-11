import java.util.Arrays;

public class MaxThreeNumberProduct {
    public static void main(String[] args) {
        int nums[] = {-100,-98,-1,2,3,4};
//        for (int )
        Arrays.sort(nums);
        int maxValue = -99999;
        for(int i = nums.length-1; i>=-1; i--){
            while(i>0){
                int max = nums[i]*nums[i-1]*nums[i-2];
                if(max>maxValue){
                    maxValue = max;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
