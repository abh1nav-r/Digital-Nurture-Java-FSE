import java.util.Scanner;
public class String_reversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[] s=a.toCharArray();
        for(int i=s.length-1;i>=0;i--){
            System.out.print(s[i]);
        }
    }
}
