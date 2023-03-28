public class DecimalToBinary {
    public static void main(String[] args) {
        int a = 5;
        a = 0^a;
        System.out.println(a);
        int rem = 0;
        String s = "";
        while(a  != 0){
            rem = a%2;
            if(rem >0) s = s + 1;
            if(rem ==0) s = s + 0;
            a = a/2;
        }
        String s1 = "";
        for(int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '0') s1 = s1 + "1";
            if (s.charAt(i) == '1') s1 = s1 + "0";
        }
        rem = 1;
        a = 1;
        int sum = 0;
        for (int i = 0; i<s1.length(); i++){
            int binary = Integer.parseInt(String.valueOf(s1.charAt(i)));
            if (binary != 0) {a = binary * rem; sum = sum + a;}

            rem = rem*2;
        }
//        System.out.println(binary);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(sum);
    }
}
