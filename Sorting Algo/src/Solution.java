
class Solution{
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        int[] nums = {7,8,9,11,12};
        s1.firstMissingPositive(nums);
        System.out.println(Test1.firtsMissingPostive(nums));

    }
}
class Solution1 {
    public int firstMissingPositive(int[] nums) {
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