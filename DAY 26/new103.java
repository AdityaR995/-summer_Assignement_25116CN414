import java.util.*;
public class new103 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int balance=10000;
        int n;
        do{
            System.out.println("welcome to bank system");
            System.out.println("SELECT FOR THE FOLLOWING");
            System.out.println("1. Adding");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.print("enter the amount to be added: ");
                    int amm=sc.nextInt();
                    balance+=amm;
                    System.out.println("amount added");
                    break;
                case 2:
                    System.out.print("enter the amount to be withdrawn: ");
                    int with=sc.nextInt();
                    if(balance>=with){
                        balance-=with;
                        System.out.println("ammount withdrawed");
                    }
                    else{
                        System.out.println("insufficient balance");
                    }
                    break;
                case 3:
                    System.out.println("current balance:"+balance);
                    break;
                case 4:
                    System.out.println("Thankyou for coming");
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }while(n!=4);
        sc.close();
    }
}
