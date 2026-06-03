import java.util.*;
public class new102 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your age:");
        int n=sc.nextInt();
        if(n<18){
            System.out.println("you are underaged, thus not eligible to vote");
        }else{
            System.out.println("you are eligible to vote");
        }sc.close();
    }
}
