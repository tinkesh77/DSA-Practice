public class Missing_number {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        System.out.println(Test.Find_the_Missing_number(arr));
    }
}
class Test{
    public static int Find_the_Missing_number(int nums[]){
        int length = nums.length;
        int excpted_outcome = 0;
        int my_outcome = 0;
        for(int i = 0; i<length+1; i++){
            excpted_outcome = excpted_outcome + i;
        }
            for(int  i = 0; i<length; i++){
            my_outcome = my_outcome + nums[i];
        }
        return excpted_outcome - my_outcome;
    }
}
