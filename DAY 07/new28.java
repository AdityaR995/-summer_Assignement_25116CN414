import java.util.*;
public class new28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.:");
        int n=sc.nextInt();
        int b=rev(n,0);
        System.out.print("reversed no.:"+b);
        sc.close();
    }
    static int rev(int n,int x){
        if(n==0){
            return x;
        }x=x*10+n%10;
        return rev(n/10,x);
    }
}
