import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Duplicate {
    public static void main(String[] args) {
//       int[] arr = {1,3,4,2,2};
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);arr.add(3);
        arr.add(4);
        arr.add(4);
        Collections.sort(arr);

//        System.out.println(ar.get(2));
//        int[] map = new  int[arr.length];
        ArrayList map = new ArrayList(arr.size());
        for (int i  =0; i<arr.size(); i++){
            int index = arr.get(i);
            map[index-1]++;
        }
       for (int i = 0; i< arr.size(); i++){
        if (arr.>2) System.out.println(i+1);
           if (map[i]==0) System.out.println(i+1);
        }
    }
