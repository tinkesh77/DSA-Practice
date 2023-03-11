public class OddEvenUsingBitWise {
    public static void main(String[] args) {
        int x = 23;
//        System.out.println(2^1);
        if ((x^1)==x+1){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
//        if ()
        boolean l = true;
        if ((x&1)==1){
            l = false;
        }
        else {
            l = true;
        }
        String  b = l?"Even":"Odd";
        System.out.println(b);
        System.out.println(isOdd(x+1));
    }
    private static boolean isOdd(int n){
        return (n&1)==1;
    }
}
