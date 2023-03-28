public class Imutablity {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Online");
        StringBuffer s2 = new StringBuffer("Online");
        System.out.println(s1.equals(s2));
        Test10 t10 = new Test10(20);
        Test20 t20 = new Test20(20);
        System.out.println(t10.equals(t20));

    }
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
class Test10{
    int n;
    Test10(int a){
        n = a;
    }
}
class Test20{
    int n;
    Test20(int a){
        n = a;
    }

}