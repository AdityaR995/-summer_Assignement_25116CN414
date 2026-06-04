import java.util.*;
public class new120{
    static Scanner sc=new Scanner(System.in);
    static int k=0;
    public static void main(String[] args) {
        String name[]=new String[256];
        int empid[]=new int[256];
        int salary[]=new int[256];
        String dept[]=new String[256];
        int n;
        do{
            System.out.println("------EMPLOYEE MANAGEMENT SYSTEM------");
            System.out.println("1. ADDITION");
            System.out.println("2. DELETION");
            System.out.println("3. UPDATION");
            System.out.println("4. SEARCH");
            System.out.println("5. DISPLAY");
            System.out.println("6. EXIT");
            n=sc.nextInt();
            switch(n){
                case 1:
                    add(name,empid,salary,dept);
                    break;
                case 2:
                    delete(name,empid,salary,dept);
                    break;
                case 3:
                    update(empid,salary);
                    break;
                case 4:
                    search(name,empid,salary,dept);
                    break;
                case 5:
                    display(name,empid,salary,dept);
                    break;
                case 6:
                    System.out.println("ALL DONE");
                    break;
                default:
                    System.out.println("invalid entry");
            }
        }while(n!=6);
        sc.close();
    }
    static void add(String name[],int empid[],int salary[],String dept[]){
        System.out.print("enter name:");
        name[k]=sc.next();
        System.out.print("enter id:");
        empid[k]=sc.nextInt();
        System.out.print("enter salary:");
        salary[k]=sc.nextInt();
        System.out.print("enter department:");
        dept[k]=sc.next();
        k++;
        System.out.println("record added");
    }
    static void delete(String name[],int empid[],int salary[],String dept[]){
        System.out.print("enter name:");
        String d=sc.next();
        boolean found=false;
        for(int i=0;i<k;i++){
            if(name[i].equals(d)){
                found=true;
                for(int j=i;j<k-1;j++){
                    name[j]=name[j+1];
                    empid[j]=empid[j+1];
                    salary[j]=salary[j+1];
                    dept[j]=dept[j+1];
                }
                k--;
                System.out.println("record deleted");
                break;
            }
        }
        if(found==false){
            System.out.println("no employee with that name is present");
        }
    }
    static void update(int empid[],int salary[]){
        System.out.print("enter id:");
        int u=sc.nextInt();
        boolean found=false;
        for(int i=0;i<k;i++){
            if(empid[i]==u){
                found=true;
                System.out.print("enter new salary:");
                salary[i]=sc.nextInt();
                System.out.println("record updated");
                break;
            }
        }
        if(found==false){
            System.out.println("no employee with that id is present");
        }
    }
    static void search(String name[],int empid[],int salary[],String dept[]){
        System.out.print("enter employee id:");
        int s=sc.nextInt();
        boolean found=false;
        for(int i=0;i<k;i++){
            if(empid[i]==s){
                found=true;
                System.out.println("name:"+name[i]);
                System.out.println("employee id:"+empid[i]);
                System.out.println("salary:"+salary[i]);
                System.out.println("department:"+dept[i]);
                break;
            }
        }
        if(found==false){
            System.out.println("no employee with that id is present");
        }
    }
    static void display(String name[],int empid[],int salary[],String dept[]){
        for(int i=0;i<k;i++){
            System.out.println("name:"+name[i]);
            System.out.println("employee id:"+empid[i]);
            System.out.println("salary:"+salary[i]);
            System.out.println("department:"+dept[i]);
            System.out.println();
        }
    }
}