import java.util.Arrays;

public class MajortyElement {
    public static void main(String[] args) {
        int nums[] = {3,3,2};
        Arrays.sort(nums);
        int max = 0;

        for(int i  = 0; i<nums.length-1; i++){
            int j = 0;
            while(i != 0&&nums[i-1]==nums[i]) {
                j++;
            }
            if(max<j){
                max = j;
            }
        }
        System.out.println(max);
    }
}
