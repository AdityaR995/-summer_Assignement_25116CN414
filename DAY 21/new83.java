import java.util.*;
public class new83 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
               c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count++;
            }
        }
        System.out.println("No. of vowels:"+" "+count);
        sc.close();
    }
}