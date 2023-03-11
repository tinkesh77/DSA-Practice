public class QickSort {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1,3,5,6,3,5};
Recursion.QuickSortCall(arr , 0 , arr.length-1);
    }
}
class Recursion{
    public static int Partition(int[] arr, int l , int h){
        int pivot = arr[l];
        int i = l , j = h;
        do {
            do {
                i++;
            }
            while (arr[i]<=pivot);
            do {
                j--;
            }
            while (arr[j]>pivot);
            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }while (i<j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void QuickSortCall(int arr[] , int l , int h){
        int j;
        if (l<h){
             j = Partition(arr , l , h);
             QuickSortCall(arr , l , j);
             QuickSortCall(arr , l , j);
             QuickSortCall(arr , j+1 , h);
         }
    }
}