import java.util.*;
public class new107{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("------SALARY MANAGEMENT SYSTEM------");
        String name[]=new String[256];
        int salary[]=new int[256];
        int n,k=0;
        do{
            System.out.println("SELECT FOR THE FOLLOWING FUNCTION");
            System.out.println("1. ADDITION");
            System.out.println("2. DELETION");
            System.out.println("3. UPDATION");
            System.out.println("4. SEARCH");
            System.out.println("5. DISPLAY");
            System.out.println("6. EXIT");
            n=sc.nextInt();
            switch(n) {
                case 1:
                    System.out.print("enter employee name:");
                    name[k]=sc.next();
                    System.out.print("enter salary:");
                    salary[k]=sc.nextInt();
                    k++;
                    System.out.println("record added");
                    break;
                case 2:
                    System.out.print("enter employee name:");
                    String d=sc.next();
                    boolean found=false;
                    for(int i=0;i<k;i++) {
                        if(name[i].equals(d)) {
                            found = true;
                            for(int j=i;j<k-1;j++) {
                                name[j]=name[j + 1];
                                salary[j]=salary[j + 1];
                            }
                            k--;
                            System.out.println("record deleted");
                            break;
                        }
                    }
                    if(found==false) {
                        System.out.println("no employee with that name is present");
                    }
                    break;
                case 3:
                    System.out.print("enter employee name:");
                    String u=sc.next();
                    boolean foundd=false;
                    for(int i=0;i<k;i++) {
                        if(name[i].equals(u)) {
                            foundd=true;
                            System.out.print("enter new salary:");
                            salary[i]=sc.nextInt();
                            break;
                        }
                    }
                    System.out.println("record updated");
                    if(foundd==false) {
                        System.out.println("no employee with that name is present");
                    }
                    break;
                case 4:
                    System.out.print("enter employee name:");
                    String s=sc.next();
                    boolean founddd=false;
                    for(int i=0;i<k;i++) {
                        if(name[i].equals(s)) {
                            founddd=true;
                            System.out.println("name:"+name[i]);
                            System.out.println("salary:"+salary[i]);
                            break;
                        }
                    }
                    if(founddd==false) {
                        System.out.println("no employee with that name is present");
                    }
                    break;
                case 5:
                    for(int i=0;i<k;i++){
                        System.out.println("name:"+name[i]);
                        System.out.println("salary:"+salary[i]);
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("ALL DONE");
                    break;
                default:
                    System.out.println("invalid entry");
            }
        } while(n!=6);
        sc.close();
    }
}