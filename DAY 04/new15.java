import java.util.*;
public class new15 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=0;
        int sum=0;
        int temp=n;
        while(n>0){
            pow++;
            n=n/10;
        }n=temp;
        while(temp>0){
            sum+=Math.pow(temp%10,pow);
            temp=temp/10;
        }if(sum==n){
            System.out.println("armstrong no.");
        }else{
            System.out.println("not armstrong no.");
        }sc.close();
    }
}