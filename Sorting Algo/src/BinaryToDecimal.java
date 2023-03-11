public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 110011;
        String str = n+" ";
        str.length();
        int i = 0;
        int finalProduct = 0;
        while(n>0){
            int pow = 1;
//            int pow = Math.pow();
            for (int j = 0; j<i; j++){
                pow = 2*pow;
            }
            i++;
            int rem = n%10;
            rem = rem*pow;
            finalProduct = finalProduct + rem;
            n = n/10;
        }
        System.out.println(str.length());
        System.out.println(finalProduct);
    }
}
