import java.util.*;
public class new117 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //addition
        //deletion
        //updation
        //display
        //search
        //exit
        System.out.println("------STUDENT MANAGEMENT SYSTEM------");
        String name[]=new String[256];
        int rollno[]=new int[256];
        int marks[]=new int[256];
        int n,k=0;
        do{
            System.out.println("SELECT FOR THE FOLLOWING FUNCTION");
            System.out.println("1. ADDITION" );
            System.out.println("2. DELETION" );
            System.out.println("3. UPDATION" );
            System.out.println("4. DISPLAY" );
            System.out.println("5. SEARCH" );
            System.out.println("6. EXIT ");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.print("enter name:");
                    name[k]=sc.next();
                    System.out.println();
                    System.out.print("enter rollno:");
                    rollno[k]=sc.nextInt();
                    System.out.println();
                    System.out.print("enter marks:");
                    marks[k]=sc.nextInt();
                    k++;
                    System.out.println("record added");
                    break;
                case 2:
                    System.out.print("enter name:");
                    String d=sc.next();
                    boolean found=false;
                    for(int i=0;i<k;i++){
                        if(name[i].equals(d)){
                            found=true;
                            for(int j=i;j<k-1;j++){
                                name[j]=name[j+1];
                                rollno[j]=rollno[j+1];
                                marks[j]=marks[j+1];
                                
                            }k--;
                        }
                    }if(found==false){
                        System.out.println("no student name is present");
                    }break;
                case 3:
                    System.out.print("enter rollno:");
                    int u=sc.nextInt();
                    boolean foundd=false;
                    for(int i=0;i<k;i++){
                        if(rollno[i]==u){
                            foundd=true;
                            System.out.println("enter the updated marks");
                            marks[i]=sc.nextInt();
                            break;
                        }
                    }System.out.println("record updated");
                    if(foundd==false){
                        System.out.println("no student with that rollno is present");
                    }break;
                case 4:
                    for(int i=0;i<k;i++){
                        System.out.println("name:"+name[i]);
                        System.out.println("rollno:"+rollno[i]);
                        System.out.println("marks:"+marks[i]);
                    }break;
                case 5:
                    System.out.print("enter rollno:");
                    int s=sc.nextInt();
                    boolean founddd=false;
                    for(int i=0;i<k;i++){
                        if(rollno[i]==s){
                            founddd=true;
                            System.out.println("name:"+name[i]);
                            System.out.println("rollno:"+rollno[i]);
                            System.out.println("marks"+marks[i]);
                            break;
                        }
                    }if(founddd==false){
                        System.out.println("no student with that rollno is present");
                    }break;
                case 6:
                    System.out.println("ALL DONE");
                    break;
                default:
                    System.out.println("invalid entry");
        }
    }while(n!=6);
    sc.close();
    }
}


