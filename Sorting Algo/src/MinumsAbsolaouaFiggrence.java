import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinumsAbsolaouaFiggrence {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<Integer> list = new ArrayList<>();
//        List<List<Integer>> list = new List<List<Integer>>()
        int min = 10000000;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i<arr.length-1; i++){
            int Diffrece = arr[i] - arr[i+1];
            if(Diffrece<=min){
                min = Diffrece;
                result.clear();
            }
            result.add(Arrays.asList(arr[i], arr[i+1]));
        }
        System.out.println(result);
     }
}
