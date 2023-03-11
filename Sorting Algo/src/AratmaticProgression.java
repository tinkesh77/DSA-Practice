import java.util.Arrays;

public class AratmaticProgression {
    public static void main(String[] args) {
        int []nums = {1,3,5};
        System.out.println(Test5.aratmaticProgression(nums));
    }
}
 class Test5{
    public static boolean aratmaticProgression(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i< arr.length-1; i++){
            int diffrence =  arr[0] - arr[1];
            if (diffrence==(arr[i]-arr[i+1])){
                count++;
                if (count==arr.length-1){
                    return true;
                }
            }
        }
        return false;
    }
}
