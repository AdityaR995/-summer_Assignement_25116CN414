import java .util.*;
public class new9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        int pro=1;
        while(n>0){
            pro*=n%10;
            n=n/10;
        }System.out.println(pro);
        sc.close();
    }
}
