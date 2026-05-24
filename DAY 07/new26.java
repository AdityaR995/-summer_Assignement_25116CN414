
import java.util.*;
public class new26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter till which no. you want the series");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        fibo(a, b, n);
        sc.close();
    }
    static void fibo(int a,int b,int n) {
        if(n==0){
            return;
        }
        int sum=a + b;
        System.out.println(sum);
        fibo(b,sum,n-1);
    }
}