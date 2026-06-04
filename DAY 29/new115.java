import java.util.*;
public class new115 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String s=sc.next();
        int n;
        do{
            System.out.println("------STRING OPERATION SYSTEM------");
            System.out.println("1. STRING LENGTH");
            System.out.println("2. CONVERT TO UPPERCASE");
            System.out.println("3. CONVERT TO LOWERCASE");
            System.out.println("4. REVERSE STRING");
            System.out.println("5. CHECK PALINDROME");
            System.out.println("6. DISPLAY STRING");
            System.out.println("7. EXIT");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Length:"+s.length());
                    break;
                case 2:
                    System.out.println("Uppercase:"+s.toUpperCase());
                    break;
                case 3:
                    System.out.println("Lowercase:"+s.toLowerCase());
                    break;
                case 4:
                    String rev="";
                    for(int i=s.length()-1;i>=0;i--){
                        rev+=s.charAt(i);
                    }
                    System.out.println("Reversed String:"+rev);
                    break;
                case 5:
                    String ans="";
                    for(int i=s.length()-1;i>=0;i--){
                        ans+=s.charAt(i);
                    }
                    if(s.equals(ans)){
                        System.out.println("Palindrome");
                    }
                    else{
                        System.out.println("Not Palindrome");
                    }
                    break;
                case 6:
                    System.out.println("String:"+s);
                    break;
                case 7:
                    System.out.println("ALL DONE");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        }while(n!=7);
        sc.close();
    }
}