import java.util.HashSet;
import java.util.Set;

public class ThirdMax {
    public static void main(String[] args) {
        int nums[] = {2,2,3,1};
        System.out.println(Test2.Max(nums));


    }
}
class Test2{
    static int Max(int nums[]){
        for(int i = 1; i<nums.length; i++){
            int j = i-1;
            int x = nums[i];
            while(j>=0&&x<nums[j]){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1] = x;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int k = 0;
        if(nums.length>2){
            for(int j = nums.length-1; j>=0; j--){
                    k++;
                    if(k==3) return nums[j];

            }
        }
        if(nums.length==2) k= nums[nums.length-1];

        return k;
    }
}
