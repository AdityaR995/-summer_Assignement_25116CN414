import java.util.*;
public class new21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter decimal value:");
        int n=sc.nextInt();
        StringBuilder binary=new StringBuilder();
        if(n==0){
            binary.append("0");
            System.out.println(binary);
        }
        while(n>0){
            binary.append(n%2);
            n=n/2;
        }System.out.println("binary conversion:"+binary.reverse());
        sc.close();
    }
    
}
