import java.util.*;
public class new70 {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }selection(arr);
        sc.close();
     }
     static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
     }
     static int max(int arr[],int start,int end){
        int max=0;
        for(int i=start;i<end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }return max;
     }
     static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int b=max(arr,0,last);
            swap(arr,b,last);
        }for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
