import java.util.*;
public class new46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no:");
        int a=sc.nextInt();
        arm(a);
        sc.close();
    }
    static void arm(int a){
        int temp=a;
        int pow=0,sum=0;
        while(a!=0){
            pow++;
            a=a/10;
        }
        a=temp;
        while(temp!=0){
            sum+=Math.pow(temp%10,pow);
            temp=temp/10;
        }
        if(sum==a){
            System.out.println(a+" "+"is armstrong no.");
        }else{
            System.out.println(a+" "+"is not armstrong no.");
        }
    }
}
