import java.util.*;
public class new45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.next();
        pal(s);
        sc.close();
    }
    static void pal(String s){
        int start=0;
        int end=s.length()-1;
        String p="";
        for(int i=end;i>=start;i--){
            p+=s.charAt(i);
        }
        if(p.equals(s)){
            System.out.println("its palindrome");
        }else{
            System.out.println("its not palindrome");
        }
    }
}
