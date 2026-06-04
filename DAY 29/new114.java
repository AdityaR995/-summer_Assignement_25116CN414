import java.util.*;
public class new114 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[256];
        int n,k=0;
        do{
            System.out.println("------ARRAY OPERATION SYSTEM------");
            System.out.println("1. ADD");
            System.out.println("2. SEARCH");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. DISPLAY");
            System.out.println("6. EXIT");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.print("enter element:");
                    arr[k]=sc.nextInt();
                    k++;
                    System.out.println("element added");
                    break;
                case 2:
                    System.out.print("enter element:");
                    int s=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<k;i++){
                        if(arr[i]==s){
                            found=true;
                            System.out.print("element found at index:"+i);
                            break;
                        }
                    }
                    if(found==false){
                        System.out.println("not found");
                    }
                    break;
                case 3:
                    System.out.print("enter index:");
                    int u=sc.nextInt();
                    if(u>=0&&u<k){
                        System.out.print("enter updated value:");
                        arr[u]=sc.nextInt();
                        System.out.println("element updated");
                    }
                    else{
                        System.out.println("invalid index");
                    }
                    break;
                case 4:
                    System.out.print("enter element:");
                    int d=sc.nextInt();
                    boolean foundd=false;
                    for(int i=0;i<k;i++){
                        if(arr[i]==d){
                            foundd=true;
                            for(int j=i;j<k-1;j++){
                                arr[j]=arr[j+1];
                            }
                            k--;
                            System.out.println("element deleted");
                            break;
                        }
                    }
                    if(foundd==false){
                        System.out.println("element not found");
                    }
                    break;
                case 5:
                    System.out.print("Array:");
                    for(int i=0;i<k;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
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
}