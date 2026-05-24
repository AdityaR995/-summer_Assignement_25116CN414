import java.util.*;
public class new17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }else{
                continue;
            }
        }if(sum==n){
            System.out.println(n+"perfect no.");
        }else{
            System.out.println(n+"not perfect no.");
        }sc.close();
    }
}
