import java.util.*;
public class new58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        System.out.print("enter how many time to rotate:");
        int r=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }rotate(arr,r);
        sc.close();
    }
    static void rotate(int arr[],int r){
        r=r%arr.length;
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[(i+r)%arr.length];
        }for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
