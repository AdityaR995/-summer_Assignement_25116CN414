import java.util.*;
public class new61{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }missno(arr);
        sc.close();
    }
    static void missno(int arr[]){
        int sum=(arr.length+1)*(arr[0]+arr[arr.length-1])/2;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
        }System.out.println("missing no. is"+" "+sum);
    }
}
