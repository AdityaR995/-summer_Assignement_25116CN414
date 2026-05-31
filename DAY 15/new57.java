import java.util.*;
public class new57{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }rev(arr);
        sc.close();
    }static void rev(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }        
}