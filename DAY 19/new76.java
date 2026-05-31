import java.util.*;
public class new76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("enter the row:");
        int r=sc.nextInt();
        System.out.print("enter column:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum+=arr[i][j];
                }else{
                    continue;
                }
            }
        }System.out.print("sum of diagonal elements is:"+" "+sum);
        sc.close();
    }    
}
