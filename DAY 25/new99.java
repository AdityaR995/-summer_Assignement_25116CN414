import java.util.*;
public class new99 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sb[]=s.split(" ");
        for(int i=0;i<s.length()-1;i++){
            for(int j=0;j<s.length()-i-1;j++){
                if(sb[j].compareTo(sb[j+1])>0){
                    String temp=sb[j+1];
                    sb[j+1]=sb[j];
                    sb[j]=temp;
                }
            }
        }for(int i=0;i<sb.length;i++){
            System.out.print(sb[i]);
        }sc.close();
    }    
}
