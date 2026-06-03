import java.util.*;
public class new111 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[256];
        int ticketno[]=new int[256];
        int seats[]=new int[256];
        int n,k=0;
        do{
            System.out.println("------TICKET BOOKING SYSTEM------");
            System.out.println("1. BOOK TICKET");
            System.out.println("2. CANCEL TICKET");
            System.out.println("3. SEARCH TICKET");
            System.out.println("4. DISPLAY ALL BOOKINGS");
            System.out.println("5. EXIT");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.print("Enter Name:");
                    name[k]=sc.next();
                    System.out.print("Enter Ticket Number:");
                    ticketno[k]=sc.nextInt();
                    System.out.print("Enter Number of Seats:");
                    seats[k]=sc.nextInt();
                    k++;
                    System.out.println("Ticket Booked");
                    break;
                case 2:
                    System.out.print("Enter Ticket Number:");
                    int d=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<k;i++){
                        if(ticketno[i]==d){
                            found=true;
                            for(int j=i;j<k-1;j++){
                                name[j]=name[j+1];
                                ticketno[j]=ticketno[j+1];
                                seats[j]=seats[j+1];
                            }
                            k--;
                            System.out.println("Ticket Cancelled");
                            break;
                        }
                    }
                    if(found==false){
                        System.out.println("Ticket Not Found");
                    }
                    break;
                case 3:
                    System.out.print("Enter Ticket Number:");
                    int s=sc.nextInt();
                    boolean foundd=false;
                    for(int i=0;i<k;i++){
                        if(ticketno[i]==s){
                            foundd=true;
                            System.out.println("Name:"+name[i]);
                            System.out.println("Ticket Number:"+ticketno[i]);
                            System.out.println("Seats:"+seats[i]);
                            break;
                        }
                    }
                    if(foundd==false){
                        System.out.println("Ticket Not Found");
                    }
                    break;
                case 4:
                    for(int i=0;i<k;i++){
                        System.out.println("Name:"+name[i]);
                        System.out.println("Ticket Number:"+ticketno[i]);
                        System.out.println("Seats:"+seats[i]);
                        System.out.println();
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