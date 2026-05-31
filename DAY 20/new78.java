import java.util.*;
public class new78 {
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
        boolean flag=false;
        if(r!=c){
            System.out.println("not symmetric");
        }
        else{
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(arr[i][j]!=arr[j][i]){
                        flag=true;
                        break;
                    }
                }
                if(flag==true){
                    break;
                }
            }
            if(flag==true){
                System.out.println("not symmetric");
            }else{
                System.out.println("symmetric");
            }
        }sc.close();
    }
}
