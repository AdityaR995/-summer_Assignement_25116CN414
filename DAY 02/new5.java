import java.util.*;
public class new5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }System.out.println("sum of digits int no."+" "+sum);
        sc.close();
    }
    
}
