import java.util.*;
public class new41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first no:");
        int a=sc.nextInt();
        System.out.print("enter the 2nd no:");
        int b=sc.nextInt();
        sum(a,b);
        sc.close();
    }
    static void sum(int a,int b){
        System.out.println(a+b);
    }
}
