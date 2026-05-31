import java.util.*;
public class new64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }duplicate(arr);
        sc.close();
    }
    static void duplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    found=true;
                    break;
                }
            }if(found==false){
                System.out.println(arr[i]);
            }
        }
    }
}
