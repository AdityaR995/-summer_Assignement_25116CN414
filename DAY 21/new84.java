import java.util.*;
public class new84 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder c=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b>='a'&&b<='z'){
                c.append((char)(b-32));
            }else{
                c.append(b);
            }
        }System.out.println(c);
        sc.close();
    }
}
