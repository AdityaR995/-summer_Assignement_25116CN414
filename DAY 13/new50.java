import java.util.*;
public class new50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,avg=0;
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("inputting no.:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }for(int i=0;i<n;i++){
            avg=sum/(n-1);
        }System.out.println("sum:"+sum+" "+"average:"+avg);
        sc.close();
    }
}
