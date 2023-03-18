public class StringQuestion {
    public static void main(String[] args) {
        String s = "book";
        int firstHalf  =s.length()/2;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<firstHalf; i++){
            if('A'==s.charAt(i)|| 'a'==s.charAt(i)) count1++;
            if( 'E'==s.charAt(i)||'e'==s.charAt(i)) count1++;
            if('I'==s.charAt(i)||'i'==s.charAt(i)) count1++;
            if('O'==s.charAt(i)||'o'==s.charAt(i)) count1++;
            if('U'==s.charAt(i)||'u'==s.charAt(i)) count1++;
        }
        for(int i =firstHalf ; i<s.length(); i++){
//            System.out.println(s.charAt(i));
            if('A'==s.charAt(i) || 'a'==s.charAt(i)) count2++;
            if( 'E'==s.charAt(i)||'e'==s.charAt(i)) count2++;
            if('I'==s.charAt(i)||'i'==s.charAt(i)) count2++;
            if('O'==s.charAt(i)||'o'==s.charAt(i)) count2++;
            if('U'==s.charAt(i)||'u'==s.charAt(i)) count2++;
        }
        if(count1==count2) {System.out.println("True");}
        else {System.out.println("False");}
    }
}
