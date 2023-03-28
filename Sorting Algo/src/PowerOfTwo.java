public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(power(3));
    }
    static  boolean power(int n){
        int sum = 1;
        int m = n;
        while (n != 0){
            sum = sum * 2;
            if (sum == m) return true;
            if (sum > m ) return false;
              n--;
        }
        return false;
    }
}
