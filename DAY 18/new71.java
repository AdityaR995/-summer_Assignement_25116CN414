import java.util.*;
public class new71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter target element:");
        int target=sc.nextInt();
        int b=binary(arr,target);
        System.out.println("target present at index"+" "+b);
        sc.close();
           
    }static int binary(int arr[],int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }return -1;
    }
}
