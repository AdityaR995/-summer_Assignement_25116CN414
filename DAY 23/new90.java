import java.util.*;
public class new90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        boolean found=false;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]>1){
                found=true;
                System.out.print(s.charAt(i));
                break;
            }
        }if(found==false){
            System.out.println("no repeated character present");
        }
        sc.close();
    }
}
