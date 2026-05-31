import java.util.*;
public class new88{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder c=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b!=' '){
                c.append(b);
            }
        }
        System.out.println(c);
        sc.close();
    }
}