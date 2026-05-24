import java.util.*;
public class new23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter decimal value:");
        int n=sc.nextInt();
        StringBuilder binary=new StringBuilder();
        if(n==0){
            binary.append("0");
            System.out.println(binary);
        }
        while(n>0){
            binary.append(n%2);
            n=n/2;
        }binary=binary.reverse();
        int count=0;
        int len=binary.length();
        for(int i=0;i<len;i++){
            if(binary.charAt(i)=='1'){
                count++;
            }else{
                continue;
            }
        }System.out.println(count);
        sc.close();
    }
}