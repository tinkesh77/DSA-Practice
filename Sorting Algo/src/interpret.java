public class interpret {
    public static void main(String[] args) {
        String str = "";
        String command = "G()()()()(al)";
        for(int i = 0; i<command.length(); i++){
            if('G'== command.charAt(i)){
                str = str + command.charAt(i);
            }
            if('('==command.charAt(i) && ')' ==command.charAt(i+1)){
                    str = str + "o";

            }
            if( '('==command.charAt(i) &&'a'==command.charAt(i+1) && 'l'==command.charAt(i+2) && ')'==command.charAt(i+3)){
                str = str + "al";
            }

        }
        System.out.println(str);
    }
}
