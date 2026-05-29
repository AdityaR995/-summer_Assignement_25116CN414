import java.util.*;
public class new56 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("inputting no.:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count = 0;
            boolean flag=false;
            for(int x=0;x<i;x++){
                if(arr[i]==arr[x]){
                    flag=true;
                    break;
                }
            }
            if(flag){
                continue;
            }else{
                for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
            }
            if(count>1){
                System.out.println(arr[i]+" has duplicate");
            }
        }
        sc.close();
    }
}