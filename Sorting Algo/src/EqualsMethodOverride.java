public class EqualsMethodOverride {
    public static void main(String[] args) {
        Test0 s1 = new Test0(123);
        Test0 s2 = new Test0(123);
         boolean cond = s1.equals(s2);
        System.out.println(cond);
        int[][] nums = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(nums.length);
    }
}
class Test0{
    private int s;

    Test0(){}

    Test0(int a)
    {
        s = a;
    }
    public boolean equals(Test0 s1){
        if (s == s1.s){
            return true;
        }
        return false;
    }

}
