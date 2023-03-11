import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set set = new HashSet(0);
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                for(int k = 0; k<nums.length; k++){
                    if(i != j&& j != k){
                        if(nums[i] != nums[j] && nums[j] != nums[k] && nums[k] != nums[i] ){
                            int triplets = nums[i] + nums[j] + nums[k];
                            if(triplets==0){
                                set.add(Arrays.asList(nums[i], nums[j] , nums[k]));
                            }
                        }
                    }
                }
            }
        }
//        return result;
        System.out.println(set);
    }
}
