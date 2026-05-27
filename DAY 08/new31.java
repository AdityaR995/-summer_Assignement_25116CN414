import java.util.*;
public class new31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n=sc.nextInt();
       for(int i=1;i<=n;i++) {
            for(char j='A';j<'A' + i;j++) {
                System.out.print(j);
            }System.out.println();
        }sc.close();
    }
}
