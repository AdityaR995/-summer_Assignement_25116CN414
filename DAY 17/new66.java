import java.util.*;
public class new66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int m=sc.nextInt();
        int[]b=new int[m];
        System.out.println("Enter elements:");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int[] union=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<k;j++){
                if(union[j]==a[i]){
                    found=true;
                    break;
                }
            }
            if(!found){
                union[k]=a[i];
                k++;
            }
        }
        for(int i=0;i<m;i++){
            boolean found=false;
            for(int j=0;j<k;j++){
                if(union[j]==b[i]){
                    found=true;
                    break;
                }
            }
            if(!found){
                union[k]=b[i];
                k++;
            }
        }
        System.out.println("Union:");
        for(int i=0;i<k;i++){
            System.out.print(union[i]+" ");
        }
        sc.close();
    }
}