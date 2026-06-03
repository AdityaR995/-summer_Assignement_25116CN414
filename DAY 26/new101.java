import java.util.*;
public class new101{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n=r.nextInt(101);
        int guess;
        int attempt=0;
        do{
            System.out.println("enter your guess");
            guess=sc.nextInt();
            if(guess>n){
                attempt++;
                System.out.println("your guess is greater");
            }else if(guess<n){
                attempt++;
                System.out.println("your guess is smaller");
            }else{
                System.out.println("correct guess!!!");
            }
        }while(guess!=n);
        System.out.println("no. of attempts are:"+" "+attempt);    
        sc.close();
    }
}