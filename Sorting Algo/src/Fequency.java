import java.util.Arrays;

public class Fequency {
    public static void main(String[] args) {
        int nums[] = {-100,-98,-1,2,3,4};
//        System.out.println(-100*-98*4);
        int product = 1;
        int max = -11111;
        for (int i  = 0; i< nums.length; i++){
            product = product * nums[i];
            if (product>=max){
                max = product;
            }
            else {
                product = max;
            }
        }
        for (int j  = 0; j< nums.length; j++){
            if (nums[j]<0){
//                nums[j] = nums[j]*(-1);

            }
        }
        Arrays.sort(nums);
        System.out.println(max);
        int realProduct = 1;
        int l = 0;
        int k = nums.length-1;
       while (l>3){
           realProduct = realProduct * nums[k];
           k--;
       }
        System.out.println(realProduct);
        System.out.println(Arrays.toString(nums));
    }
}
