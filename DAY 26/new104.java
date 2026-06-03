import java.util.*;
public class new104 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks=0;
        System.out.println("------QUIZ TIME------ ");
        System.out.println("DURATION:"+" "+60+"mins");
        System.out.print("Question 1. :");
        System.out.println("What is the name of international badminton organisation");
        System.out.println("(a)BWF");
        System.out.println("(b)WHO");
        System.out.println("(c)NBA");
        System.out.println("(d)VNL");
        String c=sc.next();
        if(c.equals("a")){
            marks++;
        }
        System.out.println();
        System.out.print("Question 2. :");
        System.out.println("Where does India rank in world economy:");
        System.out.println("(a)1st");
        System.out.println("(b)2nd");
        System.out.println("(c)3rd");
        System.out.println("(d)5th");
        String b=sc.next();
        if(b.equals("d")){
            marks++;
        }
        System.out.println();
        System.out.print("Question 3. :");
        System.out.println("Capital of India is:");
        System.out.println("(a)Goa");
        System.out.println("(b)Delhi");
        System.out.println("(c)Hyderabad");
        System.out.println("(d)Mumbai");
        String a=sc.next();
        if(a.equals("b")){
            marks++;
        }
        System.out.println("------RESULT------");
        if(marks==3){
            System.out.println("Excellent you got full marks");
        }else if(marks==2){
            System.out.println("Good job, need little improvement");

        }else if(marks==1){
            System.out.println("Needs more practice");
        }
        else{
            System.out.println("better luck next time");
        }
        System.out.println("Marks obtained:"+marks+"out of 3");
        sc.close();
    }
}
