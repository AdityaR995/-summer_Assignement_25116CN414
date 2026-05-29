import java.util.*;
public class new47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter nth value till which you want series:");
        int n=sc.nextInt();
        fibo(n);
        sc.close();
    }
    static void fibo(int n){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
