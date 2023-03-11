import java.util.Arrays;

public class GreaterThemX {
    public static void main(String[] args) {
      int nums[] = {3,5};
        System.out.println(Test4.specialArray(nums));

    }
}
class Test4 {
    public static int specialArray(int[] nums) {
        for(int i = 0; i<= nums.length; i++){
            int count = 0;
            for (int j : nums){
                if (j>=i) count++;
            }
            if (i==count) return i;
        }
        return -1;
    }
}