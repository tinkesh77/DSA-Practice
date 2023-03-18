import java.util.Arrays;

public class FindPair {
    public static void main(String[] args) {
        int arr[] = {90 ,70 ,20 ,80 ,50};
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int diff_re = arr[j] - arr[i];
                if(diff_re==45) System.out.println("1");;
            }
        }
        System.out.println("0");
    }
}
