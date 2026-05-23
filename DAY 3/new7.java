import java.util.*;
public class new7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("starting point");
        int x=sc.nextInt();
        System.out.println("ending point");
        int y=sc.nextInt();
        for(int i=x;i<y;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                if(i%Math.pow(j,0.5)==0){
                    sum++;
                }
            }if(sum==2){
                System.out.println(i);
            }
        }sc.close();
    }
}
