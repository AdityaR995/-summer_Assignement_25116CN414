import java.util.*;
public class new3 {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int fact=1;
        System.out.println("enter the no. you want the factorial of");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            fact*=i;
        }System.out.println("the factorial is"+" "+fact);
        sc.close();
    }
}
