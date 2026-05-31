import java.util.*;
public class new75 {
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
        }
        System.out.print("transpose of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=arr[j][i];
            }
        }for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }sc.close();
    }
}
