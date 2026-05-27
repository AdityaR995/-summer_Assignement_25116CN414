import java.util.*;
public class new34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no. of rows:");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            char a=(char)('A'+i-1);
            for(int j=1;j<=i;j++){
                System.out.print(a);
            }System.out.println();
        }sc.close();        
    }
}
