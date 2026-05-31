import java.util.*;
public class new63 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
    System.out.print("enter the target");
    int t=sc.nextInt();
    pair(arr,t);
    sc.close();
    }
    static void pair(int arr[],int t){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==t){
                    System.out.println("Pair: "+arr[i]+" "+arr[j]);
                    return;
                }
            }
        }System.out.println("No pair found");
    }
}
