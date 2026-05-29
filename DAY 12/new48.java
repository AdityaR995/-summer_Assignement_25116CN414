import java.util.*;
public class new48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. :");
        int a=sc.nextInt();
        perfect(a);
        sc.close();
    }static void perfect(int a){
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum+=i;
            }
        }if(sum==a){
            System.out.println(a+" "+"is perfect no.");
        }else{
            System.out.println(a+" "+"is not perfect no.");
        }
    }
}
