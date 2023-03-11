import java.util.Arrays;

public class ArraysMEadum {
    public static void main(String[] args) {
        int nums[] =  {3,2,1,5,6,4};
        for (int i = 1; i< nums.length; i++){
            int x = nums[i];
            int j = i - 1;
            while(j>=0&&x<nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = x;
        }
        int l = 3;
        int p = 0;
        int y = nums.length-1;
        while(l>0){
            p = nums[y];
            y--;
            l--;
        }
        System.out.println(p);
        int[] tr = {1,2,3,4,5};
//        System.out.println(3^1);
        System.out.println(tr.length*4);
    }
}
