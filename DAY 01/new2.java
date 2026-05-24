import java.util.*;
public class new2 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. you wnat the multiples of ");
        int n=sc.nextInt();
        System.out.println("enter the no. till which you want the multiple");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            System.out.println(n*i);
        }sc.close();
    }
}
