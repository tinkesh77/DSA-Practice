public class SingleNumber11 {
    public static void main(String[] args) {
        int ans = 0;
        int[] nums = {0,1,0,1,0,1,99};
        for(int i = 1; i<nums.length; i++){
            int j = i-1;
            int x = nums[i];
            while(j>=0&&x<nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = x;
        }
        int i = 0;
        while(i<32) {
            try{
                if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                    i = i + 2;
                }
            }
            catch (Exception e){
                ans = nums[i];
            }
            i++;
        }
        System.out.println(ans);
    }
}
