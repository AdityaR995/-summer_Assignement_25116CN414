import java.util.*;
public class new18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0){
            sum+=facto(n%10);
            n=n/10;
        }if(temp==sum){
            System.out.println("Strong no.:");
        }else{
            System.out.println("Not strong no.");
        }sc.close();
    }
    static int facto(int a){
        int fact=1;
        for(int i=a;i>0;i--){
            fact*=i;
        }return fact;
    }
}
