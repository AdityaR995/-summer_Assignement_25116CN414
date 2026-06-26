import java.util.*;
public class new67 {
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
        int[] b=new int[m];
        System.out.println("Enter elements:");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int[] ans=new int[Math.min(n,m)];
        int k=0;
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    found=true;
                    break;
                }
            }
            boolean present=false;
            for(int j=0;j<k;j++){
                if(ans[j]==a[i]){
                    present=true;
                    break;
                }
            }
            if(found&&!present){
                ans[k]=a[i];
                k++;
            }
        }
        System.out.println("Intersection:");
        for(int i=0;i<k;i++){
            System.out.print(ans[i]+" ");
    }
    sc.close();
  }   
}
