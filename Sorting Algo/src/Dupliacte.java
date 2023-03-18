import java.util.ArrayList;
import java.util.Arrays;

public class Dupliacte {
    public static void main(String[] args) {
        int nums[] = {1,1};
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                list.add(nums[i]);
            }
        }
        System.out.println(list);
    }
}
