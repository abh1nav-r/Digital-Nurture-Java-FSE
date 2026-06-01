import java.util.*;
public class Simple_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("chose the operator");
        System.out.println("press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        int c= sc.nextInt();
        switch (c) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
