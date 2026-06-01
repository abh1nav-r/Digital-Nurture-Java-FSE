import java.util.Scanner;

public class Palindrome_checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String a=sc.nextLine();
        a=a.replaceAll("[^a-zA-Z0-9]","");
        a=a.toLowerCase();
        System.out.println(a);
        char[] z=a.toCharArray();
        for(int i=z.length-1;i>=0;i--){
            System.out.print(z[i]);
            sb.append(z[i]);

        }
        System.out.println("");
        String b=sb.toString();
        if(a.equals(b)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
