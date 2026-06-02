import java.util.*;
public class new96 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean found=false;
            for(int j=1;j<s.length();j++){
                if(ch==s.charAt(j)){
                    found=true;
                    break;
                }
            }if(found==false){
                sb.append(ch);
            }
        }System.out.print("the non duplicative string is:"+" "+sb);
        sc.close();
    }
}
