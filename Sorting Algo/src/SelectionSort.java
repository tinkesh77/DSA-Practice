import java.util.Arrays;

public class SelectionSort {
    static int removeDuplicates(int arr[],int n)
    {
        if (n == 0 || n == 1)
            return n;


        int j = 0;


        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[n-1];

        return j;
    }
    static public int CountDuplicate(int[] arr){
        int n = arr.length;
        int j = 0;
        for (int i = 1; i<n; i++){
            if (arr[i] != arr[i-1]) arr[++j] = arr[i];;
        }
        return j;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4,4, 5, 5};
        int n = arr.length;
//        System.out.println(removeDuplicates(arr,n));
//        for (int i=0; i<n; i++)
//            System.out.print(arr[i]+" ");
//        System.out.println(arr[0]);
        System.out.println(CountDuplicate(arr));
    }
    public static int Mx(){
        int[] arr = {2,2,3,1};
//        1,3,12,0,0
        int i , j , k;
        for ( i = 0; i<arr.length-1; i++){
            for (j=k=i;  j<arr.length; j++){
                if (arr[j]>arr[k]) {
                    k = j;
                }
            }
            int temp =arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
        if (arr.length<=2) {
            return arr[0];
        }
//        if(arr[])
       return arr[2];
    }
}

