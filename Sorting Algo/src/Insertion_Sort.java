public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        int size = arr.length;
        int in = arr.length;
//        int temp = 0;


//        [2,1,4,5]
//        [2 |, , 4 ,5]
//        1
//         0 1 2 3 // 4 ELEMENTS

        for (int i = 1; i<size; i++){
            int j = i-1;
            int x = arr[i];
            while(x<arr[j]&&j>0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j +1] = x;
        }

//        System.out.println();
        for (int i = 0; i<arr.length-1; i++){
            System.out.print(arr[i]);
        }
    }
}
