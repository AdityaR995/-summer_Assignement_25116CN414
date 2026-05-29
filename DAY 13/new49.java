import java.util.*;
public class new49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("inputting no.:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }System.out.println("displaying no.");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }sc.close();
    }
}
