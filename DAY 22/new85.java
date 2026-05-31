import java.util.*;
public class new85 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder c=new StringBuilder(s);
        StringBuilder d=new StringBuilder(c);
        if(d.reverse().equals(c)){
            System.out.println("string is palindrome");
        }else{
            System.out.println("string not palindrome");
        }
        sc.close(); 
    }
}
