public class Parity {
    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        int j = 0;
//        for (int i = 0; i<arr.length-1; i++){
//            if ((arr[i]&2)==0){
//                int temp = arr[j];
//                arr[j] = arr[i];
//                arr[i] = temp;
//            }
//            j++;
//        }
//        byte a = (byte)130;
//        int b = (int)2147483648L;
//        System.out.println(a+ " " + b);
        Child ch = new Child();
        ch.dispaly4();
    }
}
 class Parent{
    protected void display(){
        System.out.println("Proted");
    }
 private void display2(){
        System.out.println("Private");
    }
  public void display3(){
        System.out.println("Public");
    }
  void dispaly4(){
        System.out.println("Defualt Public");

    }

}
class Child extends Parent{

}