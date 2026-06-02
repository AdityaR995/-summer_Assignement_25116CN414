import java.util.*;
public class new98 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            boolean found=false;
            for(int j=0;j<s1.length();j++){
                if(s.charAt(i)==s1.charAt(j)){
                    found=true;
                    break;
                }
            }if((found==true)&&(sb.indexOf(String.valueOf(s.charAt(i)))==-1)){
                sb.append(i);
            }System.out.print("common char:"+" "+sb.charAt(i));
        }sc.close();
    }    
}
