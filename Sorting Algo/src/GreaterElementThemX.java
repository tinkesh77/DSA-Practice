public class GreaterElementThemX {
    public static void main(String[] args) {
        int nums[] = {0,0,3,4,4};

//        int j = 1;
        int k = 0;
        for (int i = 1; i<1000; i++){
            int count = 0;
            for (int j = 0; j< nums.length; j++){
                    if (count<=nums[j]) {
                        count++;
                    }
            }
            k = count;
//            j++;
        }
        System.out.println(k);
    }
}
