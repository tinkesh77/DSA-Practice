import java.util.ArrayList;
import java.util.Arrays;

public class RerrangeArays {
    public static void main(String[] args) {
        int[] nums = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        ArrayList<Integer> listpos = new ArrayList();
        ArrayList<Integer> listneg = new ArrayList();
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0) listpos.add(nums[i]);
            if(nums[i]<0) listneg.add(nums[i]);
        }

        int k = 0 , l= 0;
        for (int i = 0; i<nums.length; i++){
             if(i%2==0){
                 nums[i] = listpos.get(k);
                 k++;
             }
             else {
                 nums[i] = listneg.get(l);
                 l++;
             }
        }
        System.out.println(listneg);
        System.out.println(listpos);
        System.out.println(Arrays.toString(nums));

//        ArrayList list = new ArrayList();

//        int[] ans = new int[nums.length];
//        for(int i = 0; i<nums.length; i++){
//            if(i%2==0){
//                if (nums[i]<0){
//                    for (int j = i; j<nums.length; j++){
//                        if (nums[j]>0){
//                            int temp = nums[i];
//                            nums[i] = nums[j];
//                            nums[j]= temp;
//                            break;
//                        }
//                    }
//                }
//            }
//            else{
//                if (nums[i]>0){
//                    for (int j = i; j<nums.length; j++){
//                        if (nums[j]<0){
//                            int temp = nums[i];
//                            nums[i] = nums[j];
//                            nums[j]= temp;
//                            break;
//                        }
//                    }
//                }
//
//            }
//        }
//        int countPostive = 0 , coutNegtive = 0;
//        for(int i = 0; i< nums.length; i++){
//            if(nums[i]>0) countPostive++;
//            if (nums[i]<0) coutNegtive++;
//        }
//        int[] pstive = new int[countPostive];
//        int[] negtive = new int[coutNegtive];
//         int count = 0;
//        for(int i = 0; i<nums.length; i++){
//            if(nums[i]>0) {
//                pstive[count] = nums[i];
//                count++;
//            }
////            if (nums[i]<0) negtive[i] = nums[i];
//        }
//        int count1 = 0;
//        for(int i = 0; i<nums.length; i++){
////            if(nums[i]>0) pstive[i] = nums[i];
//            if (nums[i]<0) {
//                negtive[count1] = nums[i];
//                count1++;
//            }
//        }
//        int count3 = 0;
//        int count4 = 0;
//         for (int i = 0; i< nums.length; i++){
//             if (i%2==0){
//                 nums[i] = pstive[count3];
//                 count3++;
//             }
//             else {
//                 nums[i] = pstive[count4];
//                 count4++;
//             }
//         }
//        System.out.println(Arrays.toString(pstive));
//        System.out.println(Arrays.toString(negtive));
    }
}
//28,-41,22,-8,46,-37,35,-9,18,-6,19,-26,15,-37,14,-10,31,-
//Expted Ooutput