import java.util.*;
public class new22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary value:");
        int n=sc.nextInt();
        int sum=0;
        int ini=1;
        while(n>0){
            sum+=(n%10)*ini;
            ini*=2;
            n=n/10;
        }System.out.println("decimal conversion:"+sum);
        sc.close();
    }
}
