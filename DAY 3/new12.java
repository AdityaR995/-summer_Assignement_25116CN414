import java.util.*;
public class new12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        if(a>b){
            c=a;
        }else{
            c=b;
        }while(true){
            if(c%a==0&&c%b==0){
                System.out.println("lcm="+c);
                break;
            }else{
                c++;
            }
        }sc.close();
    }
}
