import java.util.*;
public class new44 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        facto(a);
        sc.close();

    }
    static void facto(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }System.out.println("factorial is"+" "+fact);
    }
}
