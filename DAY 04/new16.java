package DAY4;
import java.util.*;
public class new16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("select start:");
        int x=sc.nextInt();
        System.out.println("ending range");
        int y=sc.nextInt();
        for(int i=x;i<=y;i++){
            int b=armno(i);
            if(b!=0){
                System.out.println(b);
            }
        }sc.close();
    }
    static int armno(int a){
        int pow=0;
        int sum=0;
        int temp=a;
        while(a>0){
            pow++;
            a=a/10;
        }a=temp;
        while(temp>0){
            sum+=Math.pow(temp%10,pow);
            temp=temp/10;
        }if(sum==a){
            return a;
        }else{
            return 0;
        }
    }
}
