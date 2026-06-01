import java.util.*;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<11;i++){
            System.out.println(i+ "*" + a +"="+i*a);
        }
    }
}
