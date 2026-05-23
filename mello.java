public class mello {
    public static void main(String[] args) {
        char mapp[]=new char[256];
        char mappp[]=new char[256];
        String s="hemlu";
        String t="gemlu";
        if(s.length()!=t.length()){
            System.out.println("false");
        }else{
            for(int i=0;i<s.length();i++){
                char c1=s.charAt(i);
                char c2=t.charAt(i);
                if(mapp[c1]==0&&mappp[c2]==0){
                    mapp[c1]=c2;
                    mappp[c2]=c1;
                }if(mapp[c1]!=c2){
                    System.out.println("false");
                    break;
                }
            }
        }
    }
}
