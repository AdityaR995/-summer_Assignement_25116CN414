import java.util.*;
public class new54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("inputting no.:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }System.out.print("enter no. to search:");
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }else{
                continue;
            }
        }System.out.println("frequency of "+" "+x +" "+"is:"+count);
        sc.close();
    }
}
