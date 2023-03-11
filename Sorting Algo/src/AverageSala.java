import java.util.Arrays;

public class AverageSala {
    public static void main(String[] args) {
        int nums[] = {1000,2000,3000};
        System.out.println(Test6.average(nums));
        System.out.println(Test6.average1(nums));
    }
}
class Test6{
    public static double average1(int[] salary){
        double Avgsum = 0;
        for (int i = 0 ; i<salary.length; i++){
            Avgsum = Avgsum + salary[i];
        }
        Arrays.sort(salary);
        Avgsum = Avgsum - (salary[0]+salary[salary.length-1]);
        return Avgsum/ (salary.length-2);
    }
    public static double average(int[] salary) {
        for(int  i  = 1; i<salary.length; i++){
            int x = salary[i];
            int j = i - 1;
            while(j>=0&&x<salary[j]){
                salary[j+1] = salary[j];
                j--;
            }
            salary[j+1] = x;
        }
        double Avgsum = 0;
        for( int j = 1; j<salary.length-1; j++){
            Avgsum = Avgsum + salary[j];
        }
        if (salary.length==3) return Avgsum;
        return Avgsum/2;
    }
}
