import java.util.*;
public class new7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("starting point:");
        int x=sc.nextInt();
        System.out.print("ending point:");
        int y=sc.nextInt();
        for(int i=x;i<y;i++){
            if(i<2){
                continue;
            }   
            int sum=0;
            for(int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    sum++;
                }
            }if(sum==0){
                System.out.println(i);
            }
        }sc.close();
    }
}
