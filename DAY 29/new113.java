import java.util.*;
public class new113 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("------MENU DRIVEN CALCULATOR------");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. EXIT");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.print("Enter First Number:");
                    int a=sc.nextInt();
                    System.out.print("Enter Second Number:");
                    int b=sc.nextInt();
                    System.out.println("Result:"+(a+b));
                    break;
                case 2:
                    System.out.print("Enter First Number:");
                    int c=sc.nextInt();
                    System.out.print("Enter Second Number:");
                    int d=sc.nextInt();
                    System.out.println("Result:"+(c-d));
                    break;
                case 3:
                    System.out.print("Enter First Number:");
                    int e=sc.nextInt();
                    System.out.print("Enter Second Number:");
                    int f=sc.nextInt();
                    System.out.println("Result:"+(e*f));
                    break;
                case 4:
                    System.out.print("Enter First Number:");
                    int g=sc.nextInt();
                    System.out.print("Enter Second Number:");
                    int h=sc.nextInt();
                    if(h!=0){
                        System.out.println("Result:"+(g/h));
                    }
                    else{
                        System.out.println("Division By Zero Not Possible");
                    }
                    break;
                case 5:
                    System.out.println("ALL DONE");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        }while(n!=5);
        sc.close();
    }
}