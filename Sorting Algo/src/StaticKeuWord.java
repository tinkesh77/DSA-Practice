public class StaticKeuWord {
    public static void main(String[] args) {
   Staitc s = new Staitc();
   s.sub();
   s.add();
    }

}
 class Staitc{

    Staitc() {
        a = 10;
        b = 40;
    }

    static int a;
    static int b;
    static int  c;
    static {
        a=20;
        b=10;
    }

    static void add(){
        System.out.println(a+b);
    }
    void sub(){
        System.out.println(a-b);
    }
}


