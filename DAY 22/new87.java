import java.util.*;
public class new87{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        char target=sc.next().charAt(0);
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b==target){
                count++;
            }else{
                continue;
            }
            System.out.print(count);
        }sc.close();
    }
}