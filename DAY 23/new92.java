import java.util.*;
public class new92 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max=0;
        char a=' ';
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]>max){
                max=arr[s.charAt(i)];
                a=s.charAt(i);
            }
        }System.out.println("maximum occuring char is:"+" "+a);
        sc.close();
    }    
}
