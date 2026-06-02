import java.util.*;
public class new97 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array1:");
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }System.out.print("enter size of array2:");
        int n1=sc.nextInt();
        String brr[]=new String[n1];
        for(int i=0;i<n1;i++){
            brr[i]=sc.next();
        }String crr[]=new String[n+n1];
        int i=0,j=0,k=0;
        while(i<n&&j<n1){
            if(arr[i].compareTo(brr[j])<0){
                crr[k++]=arr[i++];
            }else{
                crr[k++]=brr[j++];
            }
        }while(i<n){
            crr[k++]=arr[i++];
        }while(j<n1){
            crr[k++]=brr[j++];
        }for(int b=0;b<n+n1;b++){
            System.out.print("merged array:"+" "+crr[b]);
        }sc.close();
    }    
}
