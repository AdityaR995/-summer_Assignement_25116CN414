import java.util.*;
public class new89 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==1){
                System.out.print(s.charAt(i));
                break;
            }
        }System.out.println("no non repeated character present");
        sc.close();
    }
}
