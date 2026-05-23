import java.util.*;
public class new4 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. whose digit need's to be counted");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            n=n/10;
            sum++;
        }System.out.println(sum);
        sc.close();
    }
}
