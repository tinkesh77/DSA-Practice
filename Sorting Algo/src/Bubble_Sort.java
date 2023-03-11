import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Bubble_Sort {
    public static void main(String[] args) {
        Integer[] arr = {1,5,7,3,2};
        int n = arr.length;
//        String arr = {"tinkesj"};
//        arr.length()
        System.out.println(n);
        int ans[] = new int[arr.length];
        for (int i = 0; i<n-1; i++){
            for (int j = 0; j<=n-2-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }

            }
        }
//        Objects obj = new Object();
        System.out.println(Arrays.toString(arr));
    }
    Test22 t = new Test22();

}
class Test22{
    void wrun(){
        System.out.println("Run");
    }
}