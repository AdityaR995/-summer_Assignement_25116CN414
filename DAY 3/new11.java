import java.util.*;
public class new11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b>0){
            int c=a%b;
            a=b;
            b=c;
        }System.out.println("GCD is="+a);
        sc.close();
    }
}
