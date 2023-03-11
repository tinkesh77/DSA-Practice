import java.util.Arrays;

public class RankTransformofanArray {
    public static void main(String[] args) {
        int j , k ,i;
        int[] arr = {37,12,28,9,100,56,80,5,12  };
        int[] ans = new int[arr.length];
        for(i = 0; i<arr.length-1; i++){
            for(j=k=i; j< arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
//            if ()
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));
        }
}
