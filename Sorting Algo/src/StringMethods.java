public class StringMethods {
    public static void main(String[] args) {
            String str = "255.100.50.0";
            String modfit = "";
            for (int i = 0; i<str.length(); i++){
             if('.'==str.charAt(i)){
                 modfit = modfit + "[.]";
             }
             else{
                 modfit = modfit + str.charAt(i);
             }
            }
        System.out.println(modfit);
    }
    static void Ipadd(String str){
        String modfit = "";
//        modfit = '.'==str.charAt(i)
    }
}
