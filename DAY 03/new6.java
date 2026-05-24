import java.util.*;
public class new6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            if(n%Math.pow(i,0.5)==0){
                System.out.println("not prime");
            }else{
                System.out.println("prime no.");
            }
        }sc.close();
        
    }
}
