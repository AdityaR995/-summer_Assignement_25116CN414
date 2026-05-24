import java.util.*;
public class new27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.:");
        int n=sc.nextInt();
        int b=sum(n,0);
        System.out.println("sum of the digits:"+b);
        sc.close();
    }
    static int sum(int n,int sum){
        if(n==0){
            return sum;
        }sum+=n%10;
        return sum(n/10,sum);
    }
}
