import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        int ret = 0;
        for(int i = 1; i<nums.length; i++){
            int x = nums[i];
            int j = i - 1;
                while(j>-1&&x <nums[j]){
//                    nums[i]  = nums[j];
                    nums[j+1] = nums[j];
                    j--;
                }
            nums[j+1] = x;
        }
        int max = 0;
        int  j =0;
        while(j<nums.length-1){
            int count = 0;
            while(j< nums.length-1&&nums[j]==nums[j+1]){
                count++;
                j++;
            }
            if (count>=max){
                max = count;
                ret = nums[j];
            }
            j++;
        }

//short a   = (byte)02;


        System.out.println(Arrays.toString(nums));
        System.out.println(max+1);
        System.out.println(ret);
    }
}
