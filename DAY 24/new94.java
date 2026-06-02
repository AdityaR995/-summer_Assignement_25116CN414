import java.util.*;
public class new94 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<sb.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                sb.append(s.charAt(i));
                sb.append(count);
            }
        }sb.append(s.charAt(s.length()-1));
        sb.append(count);
        System.out.println("compressed string is:"+" "+sb);
        sc.close();
    }
}
