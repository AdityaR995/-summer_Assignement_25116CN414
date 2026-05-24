import java.util.*;
public class new24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base:");
        int n=sc.nextInt();
        System.out.println("enter power");
        int pow=sc.nextInt();
        int pro=1;
        for(int i=1;i<=pow;i++){
            pro*=n;
        }System.out.println(pro);
        sc.close();
    }
}
