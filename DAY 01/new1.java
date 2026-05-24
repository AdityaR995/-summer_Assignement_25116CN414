import java.util.*;
public class new1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the nth no.=");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }System.out.println(sum);
        sc.close();
    }
}
