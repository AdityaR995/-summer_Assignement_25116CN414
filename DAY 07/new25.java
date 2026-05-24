import java.util.*;
public class new25{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=facto(n);
        System.out.println(b);
        sc.close();
    }
    static int facto(int a){
        if(a==0||a==1){
            return 1;
        }
        return a*facto(a-1);
    }
}
