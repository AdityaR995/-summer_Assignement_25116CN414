import java.util.*;
public class new62{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the element:");
        int e=sc.nextInt();
        freq(arr,e);
        sc.close();
    }
    static void freq(int arr[],int n){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }else{
                continue;
            }
        }if(count==0){
            System.out.print("given element not present");
        }else{
            System.out.println("frequency of "+" "+n+" "+"is"+" "+count);
        }
    }
}