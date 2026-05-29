import java.util.*;
public class new52 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("inputting no.:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
    int even=0,odd=0;
    for(int i=0;i<n;i++){
        if(arr[i]%2==0){
            even++;
        }else{
            odd++;
        }
    }System.out.println("no. of even no. :"+even);
    System.out.println("no. of odd no. :"+odd);
    sc.close();
    }
}
