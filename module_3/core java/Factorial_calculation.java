import java.util.*;
public class Factorial_calculation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=0){
            System.out.println("invalid");
        }
        else{
        int fact=1;
        for(int i=1;i<a;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
    }
}
