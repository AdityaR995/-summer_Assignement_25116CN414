import java.util.*;
public class new8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. to be reversed=");
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }System.out.println(rev);
        sc.close();
    }
}
