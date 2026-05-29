import java.util.*;
public class new53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("inputting no.:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }System.out.println("enter no. to search");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("element is at index:"+i);
                break;
            }else{
                continue;
            }
        }sc.close();
    }
}
