import java.util.*;
public class new60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }swap(arr);
        sc.close();
    }
    static void swap(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}