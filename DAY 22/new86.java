import java.util.*;
public class new86 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;
        if(s==""){
            System.out.println(0);
        }else{
            for(int i=0;i<s.length();i++){
                char a=s.charAt(i);
                if(a==' '){
                    count++;
                }
            }System.out.println(count);
            sc.close();
        }
    }
}
