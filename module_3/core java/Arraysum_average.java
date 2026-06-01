import java.util.*;
public class Arraysum_average {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double average=sum/n;
        System.out.println("sum of array = "+sum);
        System.out.println("average= "+average);

    }
}
