import java.util.*;
public class new93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string:");
        String s=sc.nextLine();
        StringBuilder c=new StringBuilder(s);
        int k=sc.nextInt();
        for(int i=0;i<k%c.length();i++){
            char ch=c.charAt(0);
            c.deleteCharAt(0);
            c.append(ch);
        }System.out.println("rotated string:"+" "+c);
        sc.close();
    }
}
