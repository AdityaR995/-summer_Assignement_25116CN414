import java.util.*;
public class new81 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char arr[]=s.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }System.out.println("the length is:"+" "+count);
        sc.close();
    }
}
