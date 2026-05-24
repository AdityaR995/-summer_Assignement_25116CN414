import java.util.*;
public class new20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.:");
        int max=0;
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            while(n%i==0){
                max=i;
                n=n/i;
            }
        }System.out.println(max);
        sc.close();
    }
}
