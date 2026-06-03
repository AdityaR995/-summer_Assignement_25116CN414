import java.util.*;
public class new109 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String book[]=new String[256];
        String author[]=new String[256];
        int copies[]=new int[256];
        int n,k=0;
        do {
            System.out.println("------LIBRARY MANAGEMENT SYSTEM------");
            System.out.println("1. ADD BOOK");
            System.out.println("2. DELETE BOOK");
            System.out.println("3. SEARCH BOOK");
            System.out.println("4. DISPLAY ALL BOOKS");
            System.out.println("5. ISSUE BOOK");
            System.out.println("6. EXIT");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.print("Enter Book Name:");
                    book[k]=sc.next();
                    System.out.print("Enter Author Name:");
                    author[k]=sc.next();
                    System.out.print("Enter Number of Copies:");
                    copies[k]=sc.nextInt();
                    k++;
                    System.out.println("Book Added");
                    break;
                case 2:
                    System.out.print("Enter Book Name:");
                    String d=sc.next();
                    boolean found=false;
                    for(int i=0;i<k;i++) {
                        if(book[i].equals(d)){
                            found=true;
                            for(int j=i;j<k-1;j++) {
                                book[j]=book[j+1];
                                author[j]=author[j+1];
                                copies[j]=copies[j+1];
                            }
                            k--;
                            System.out.println("Book Deleted");
                            break;
                        }
                    }
                    if(found==false) {
                        System.out.println("Book Not Found");
                    }
                    break;
                case 3:
                    System.out.print("Enter Book Name:");
                    String s=sc.next();
                    boolean foundd=false;
                    for(int i=0;i<k;i++){
                        if(book[i].equals(s)){
                            foundd=true;
                            System.out.println("Book Name:"+book[i]);
                            System.out.println("Author:"+author[i]);
                            System.out.println("Copies Available:"+copies[i]);
                            break;
                        }
                    }
                    if(foundd==false) {
                        System.out.println("Book Not Found");
                    }
                    break;
                case 4:
                    for(int i=0;i<k;i++){
                        System.out.println("Book Name:"+book[i]);
                        System.out.println("Author:"+author[i]);
                        System.out.println("Copies:"+copies[i]);
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.print("Enter Book Name:");
                    String b=sc.next();
                    boolean founddd=false;
                    for(int i=0;i<k;i++){
                        if(book[i].equals(b)){
                            founddd=true;
                            if(copies[i]>0){
                                copies[i]--;
                                System.out.println("Book Issued Successfully");
                                System.out.println("Remaining Copies: "+copies[i]);
                            }
                            else {
                                System.out.println("Book Not Available");
                            }
                            break;
                        }
                    }
                    if(founddd==false) {
                        System.out.println("Book Not Found");
                    }
                    break;
                case 6:
                    System.out.println("ALL DONE");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        } while(n!=6);
        sc.close();
    }
}