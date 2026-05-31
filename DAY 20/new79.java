import java.util.*;
public class new79 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row:");
        int r=sc.nextInt();
        System.out.print("enter column:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }System.out.print("the sum of row"+" "+i+" "+"is"+" "+sum);
        }sc.close();
    }
}
