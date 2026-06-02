import java.util.*;
public class new91{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        int arr[]=new int[256];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(arr[i]!=0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
        sc.close();
    }
}