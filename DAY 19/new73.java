import java.util.*;
public class new73{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows of matrix1: ");
        int r1=sc.nextInt();
        System.out.print("Enter columns of matrix1: ");
        int c1=sc.nextInt();
        System.out.print("Enter rows of matrix2: ");
        int r2=sc.nextInt();
        System.out.print("Enter columns of matrix2: ");
        int c2=sc.nextInt();
        if(r1!=r2||c1!=c2){
            System.out.println("Matrix not possible");
            
        }else{
            int arr[][] = new int[r1][c1];
            int brr[][] = new int[r2][c2];
            int sum[][] = new int[r1][c2];
            System.out.println("Enter first matrix:");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter second matrix:");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    brr[i][j]=sc.nextInt();
            }
        }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    sum[i][j]=arr[i][j]+brr[i][j];
                }
            }
            System.out.println("Sum Matrix:");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    System.out.print(sum[i][j]+" ");
            }System.out.println();
        }
        }
        sc.close();
    }
}
