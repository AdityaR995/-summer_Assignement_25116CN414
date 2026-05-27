import java.util.*;
public class new29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter how many rows:");
        int x=sc.nextInt();
        System.out.println("enter 1 to print leftmost triangle ");
        System.out.println("enter 2 to print rightmost triangle");
        int n=sc.nextInt();
        if(n==1){
            for(int i=0;i<x;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
            }System.out.println();
        }
        }else{
            for(int i=0;i<x;i++){
                for(int j=x-1;j>i;j--){
                    System.out.print(" ");
                }for(int k=0;k<=i;k++){
                    System.out.print("*");
                }System.out.println();
            }
        }
        sc.close();
    }
}
