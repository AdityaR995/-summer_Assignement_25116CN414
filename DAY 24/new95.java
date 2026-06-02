import java.util.*;
public class new95 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        String longer=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>longer.length()){
                longer=arr[i];
            }
        }System.out.print("longer word is:"+" "+longer);
        sc.close();
    }
}
