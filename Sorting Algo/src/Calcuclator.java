import java.util.Scanner;

public class Calcuclator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Tow Oprand3
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter The Operation");
        String s = in.next();
        switch (s){
            case "+" :
                System.out.println(a + b);
                break;
            case "-" :
                System.out.println(a - b);
                break;
            case "/" :
                System.out.println(a / b);
                break;
            case "*" :
                System.out.println(a * b);
                break;
            case "%" :
                System.out.println(a % b);
                break;
            default:
                System.out.println("The Oprator is not Supported By our System");
        }
    }
}
