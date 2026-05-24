package DAY4;
import java.util.*;
public class new14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            int sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(b);
        sc.close();
    }
}
