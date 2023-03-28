import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Myclass {
    Myclass(){}
    Myclass(int x){
        System.out.println("Super Class constr");
    }
    public static void main(String[] args) {
        sub s = new sub();
    }
}
class sub extends Myclass {

 sub(){
//     super(4); super();
     System.out.println("Sub con");
 }
}