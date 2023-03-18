import java.util.Arrays;

public class findMissingPositveInterger {
    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 2, 1, 1};
        int ans[] = new int[2];
        Arrays.sort(arr);
//        for(int  i  =0; i< arr.length; i++){
//            int correct_index = arr[i]-1;
//            if(arr[i] != arr[correct_index]){
//                swap(arr , i , correct_index);
//            }
//        }
        for(int i = 0; i< arr.length-1; i++){
            if (arr[i]==arr[i+1]) {
                ans[0] = arr[i];
                break;
            }
        }
        int max = 99999999;
        for(int i = 0; i< arr.length; i++){
            int j = arr[i]-1;
            if (j != i) {
                ans[1] = i + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
    }
    static void swap(int nums[] , int i , int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
