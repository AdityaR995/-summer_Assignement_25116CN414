import java.util.*;
public class new108{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[256];
        int rollno[]=new int[256];
        int phy[]=new int[256];
        int chem[]=new int[256];
        int math[]=new int[256];
        int n,k=0;
        do{
            System.out.println("------MARKSHEET GENERATION SYSTEM------");
            System.out.println("1. ADD STUDENT");
            System.out.println("2. SEARCH STUDENT");
            System.out.println("3. DISPLAY ALL");
            System.out.println("4. GENERATE MARKSHEET");
            System.out.println("5. EXIT");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.print("Enter Name:");
                    name[k]=sc.next();
                    System.out.print("Enter Roll No:");
                    rollno[k]=sc.nextInt();
                    System.out.print("Physics Marks:");
                    phy[k]=sc.nextInt();
                    System.out.print("Chemistry Marks:");
                    chem[k]=sc.nextInt();
                    System.out.print("Maths Marks:");
                    math[k]=sc.nextInt();
                    k++;
                    System.out.println("Record Added");
                    break;
                case 2:
                    System.out.print("Enter Roll No: ");
                    int s=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<k;i++){
                        if(rollno[i]==s){
                            found=true;
                            System.out.println("Name: "+name[i]);
                            System.out.println("Roll No: "+rollno[i]);
                            break;
                        }
                    }
                    if(found==false) {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 3:
                    for(int i=0;i<k;i++){
                        System.out.println("Name:"+name[i]);
                        System.out.println("RollNo:"+rollno[i]);
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Enter Roll No: ");
                    int r=sc.nextInt();
                    boolean foundd=false;
                    for(int i=0;i<k;i++){
                        if(rollno[i]==r){
                            foundd=true;
                            int total=phy[i]+chem[i]+math[i];
                            double per=total/3.0;
                            System.out.println("------MARKSHEET------");
                            System.out.println("Name: "+name[i]);
                            System.out.println("Roll No: "+rollno[i]);
                            System.out.println("Physics: "+phy[i]);
                            System.out.println("Chemistry: "+chem[i]);
                            System.out.println("Maths: "+math[i]);
                            System.out.println("Total: "+total);
                            System.out.println("Percentage: "+per);
                            if(per>=90){
                                System.out.println("Grade:A");
                            }
                            else if(per>=75) {
                                System.out.println("Grade:B");
                            }
                            else if(per>=60) {
                                System.out.println("Grade:C");
                            }
                            else {
                                System.out.println("Grade:D");
                            }
                            break;
                        }
                    }
                    if(foundd==false) {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 5:
                    System.out.println("ALL DONE");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        } while(n!=5);
        sc.close();
    }
}