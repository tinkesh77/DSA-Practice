import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
//        int b;
//        int g = 45;
//        b = (int)4000000;
//        System.out.println(b);
         int[] cont = new int[2];
        int nums[] = {1,1};
        int i = 0;
        int missing = 0;
        int twice = 0;
        while (i<nums.length){
            int correc_index = nums[i]-1;
            if (nums[i]<nums.length&&nums[i] != nums[correc_index]){
                    int temp  = nums[i];
                    nums[i] = nums[correc_index];
                    nums[correc_index] = temp;
            }
            else {
               if (i != 0){if (nums[i-1] == nums[i]) cont[0] = nums[i];}
                i++;
            }


        }
        for (int j = 0; j<nums.length; j++){
            if ( nums[j] != j+1) cont[1] = j+1;
//            k++;
        }
        System.out.println(Arrays.toString(cont));
//        System.out.println(missing);
//        System.out.println(twice);

    }
}
