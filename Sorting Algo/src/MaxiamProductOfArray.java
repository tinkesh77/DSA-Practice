public class MaxiamProductOfArray {
    public static void main(String[] args) {
        int[] nums = {1,5,4,5};
        System.out.println(Test7.maxProduct(nums));
        System.out.println(Test7.maxProduct(nums,4));

    }
}
class Test7{
    public static int maxProduct(int[] nums) {
        int max = 0;
        int Puramax = 0;
     for (int i = 0; i< nums.length; i++){
         for (int j = 0; j< nums.length; j++){
             if (i != j){
                 max = (nums[i]-1)*(nums[j]-1);
                 if (max>Puramax){
                     Puramax = max;
                 }
             }
         }
     }
     return Puramax;
    }
    public static int maxProduct(int[] nums , int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }


}