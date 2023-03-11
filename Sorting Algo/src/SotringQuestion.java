import java.util.Arrays;

public class SotringQuestion {
    public static void main(String[] args) {
        int arr[] = {0,1};
//        System.out.println(Arrays.toString(question.missingNumber(arr)));
        System.out.println(question.missingNumber(arr));
        System.out.println(arr.length);
    }
}
class question{
    static public int missingNumber(int[] nums) {
        int j , k;
    for (int i = 0; i<nums.length; i++){
        for (k=j=i; j<nums.length; j++){
            if (nums[j]<nums[k]) k = j;

        }
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k] = temp;
        }
        for (int i = 0; i<nums.length; i++){
            if (i==nums[i]){}
            else return i;
        }
        return nums[nums.length-1]+1;
    }

}
