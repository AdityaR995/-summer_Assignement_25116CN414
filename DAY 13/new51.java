import java.util.*;
public class new51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("inputting no.:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int max=0,min=0;
        for(int i=1;i<n;i++){
            if(arr[max]<arr[i]){
                max=i;
            }if(arr[min]>arr[i]){
                min=i;
            }
        }System.out.println("largest elements is:"+arr[max]);
        System.out.println("smallest element is :"+arr[min]);
        sc.close();
    }
}
