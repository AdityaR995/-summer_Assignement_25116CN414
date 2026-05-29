import java.util.*;
public class new43{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no:");
        int a=sc.nextInt();
        prime(a);
        sc.close();
        
    }
    static void prime(int a){
        for(int i=2;i<=Math.pow(a,0.5);i++){
            if(a%i==0){
                System.out.println(a+" "+"is not prime no.");
                return;
            } 
        }System.out.println(a+" "+"is a prime no.");
    }
}