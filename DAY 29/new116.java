import java.util.*;
public class new116 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String item[]=new String[256];
        int quantity[]=new int[256];
        int price[]=new int[256];

        int n,k=0;

        do{
            System.out.println("------INVENTORY MANAGEMENT SYSTEM------");
            System.out.println("1. ADD");
            System.out.println("2. DELETE");
            System.out.println("3. UPDATE");
            System.out.println("4. SEARCH");
            System.out.println("5. DISPLAY");
            System.out.println("6. EXIT");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.print("Enter Item Name:");
                    item[k]=sc.next();
                    System.out.print("Enter Quantity:");
                    quantity[k]=sc.nextInt();
                    System.out.print("Enter Price:");
                    price[k]=sc.nextInt();
                    k++;
                    System.out.println("Item Added");
                    break;
                case 2:
                    System.out.print("Enter Item Name:");
                    String d=sc.next();
                    boolean found=false;
                    for(int i=0;i<k;i++){
                        if(item[i].equals(d)){
                            found=true;
                            for(int j=i;j<k-1;j++){
                                item[j]=item[j+1];
                                quantity[j]=quantity[j+1];
                                price[j]=price[j+1];
                            }
                            k--;
                            System.out.println("Item Deleted");
                            break;
                        }
                    }
                    if(found==false){
                        System.out.println("Not Found");
                    }
                    break;
                case 3:
                    System.out.print("Enter Item Name:");
                    String u=sc.next();
                    boolean foundd=false;
                    for(int i=0;i<k;i++){
                        if(item[i].equals(u)){
                            foundd=true;
                            System.out.print("Enter New Quantity:");
                            quantity[i]=sc.nextInt();
                            System.out.println("Quantity Updated");
                            break;
                        }
                    }
                    if(foundd==false){
                        System.out.println("Item Not Found");
                    }
                    break;
                case 4:
                    System.out.print("Enter Item Name:");
                    String s=sc.next();
                    boolean founddd=false;
                    for(int i=0;i<k;i++){
                        if(item[i].equals(s)){
                            founddd=true;
                            System.out.println("Item:"+item[i]);
                            System.out.println("Quantity:"+quantity[i]);
                            System.out.println("Price:"+price[i]);
                            break;
                        }
                    }
                    if(founddd==false){
                        System.out.println("Item Not Found");
                    }
                    break;
                case 5:
                    for(int i=0;i<k;i++){
                        System.out.println("Item:"+item[i]);
                        System.out.println("Quantity:"+quantity[i]);
                        System.out.println("Price:"+price[i]);
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