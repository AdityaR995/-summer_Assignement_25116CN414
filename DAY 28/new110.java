import java.util.*;
public class new110 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[256];
        int accno[]=new int[256];
        int balance[]=new int[256];
        int n,k=0;
        do{
            System.out.println("------BANK ACCOUNT SYSTEM------");
            System.out.println("1. CREATE ACCOUNT");
            System.out.println("2. DEPOSIT MONEY");
            System.out.println("3. WITHDRAW MONEY");
            System.out.println("4. SEARCH ACCOUNT");
            System.out.println("5. DISPLAY ALL ACCOUNTS");
            System.out.println("6. EXIT");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.print("Enter Name:");
                    name[k]=sc.next();
                    System.out.print("Enter Account Number:");
                    accno[k]=sc.nextInt();
                    System.out.print("Enter Initial Balance:");
                    balance[k]=sc.nextInt();
                    k++;
                    System.out.println("Account Created");
                    break;
                case 2:
                    System.out.print("Enter Account Number:");
                    int d=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<k;i++){
                        if(accno[i]==d){
                            found=true;
                            System.out.print("Enter Amount:");
                            int amt=sc.nextInt();
                            balance[i]+=amt;
                            System.out.println("Money Deposited");
                            break;
                        }
                    }
                    if(found==false){
                        System.out.println("Account Not Found");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account Number:");
                    int w=sc.nextInt();
                    boolean foundd=false;
                    for(int i=0;i<k;i++){
                        if(accno[i]==w){
                            foundd=true;
                            System.out.print("Enter Amount:");
                            int amt=sc.nextInt();
                            if(balance[i]>=amt){
                                balance[i]-=amt;
                                System.out.println("Withdrawal Successful");
                            }
                            else{
                                System.out.println("Insufficient Balance");
                            }
                            break;
                        }
                    }
                    if(foundd==false){
                        System.out.println("Account Not Found");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account Number:");
                    int s=sc.nextInt();
                    boolean founddd=false;
                    for(int i=0;i<k;i++){
                        if(accno[i]==s){
                            founddd=true;
                            System.out.println("Name:"+name[i]);
                            System.out.println("Account Number:"+accno[i]);
                            System.out.println("Balance:"+balance[i]);
                            break;
                        }
                    }
                    if(founddd==false){
                        System.out.println("Account Not Found");
                    }
                    break;
                case 5:
                    for(int i=0;i<k;i++){
                        System.out.println("Name:"+name[i]);
                        System.out.println("Account Number:"+accno[i]);
                        System.out.println("Balance:"+balance[i]);
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("ALL DONE");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        }while(n!=6);
        sc.close();
    }
}