import java.util.*;
public class Number_gussing_game {
    public static void main(String[] args) {
        double a=Math.random()*100;
        int b= (int)a;
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        while(c!=b){
            if(c>b){
                System.out.println("hind : less than "+ c );
                c=sc.nextInt();
            }
            else {
                System.out.println("hind : greater than "+c);
                c=sc.nextInt();
            }
        } 
        System.out.println("whoooh! you found the value" );   
    }
}
