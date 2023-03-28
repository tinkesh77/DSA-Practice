public class Inhertaince {
    public static void main(String[] args) {
          Super s = new Super();
          Sub sub = new Sub();
          Super s1 = new Sub();
//        System.out.println(s1.m1());
        s1.m1();
        s1.m2();
    }
}

class Super{
    void m1(){
        System.out.println("Super m1");
    }
    void m2(){
        System.out.println("Super m2");
    }
}
class Sub extends Super{
    void m2(){
        System.out.println("Sub m2");
    }
    void m3(){
        System.out.println("sub m3");
    }
}