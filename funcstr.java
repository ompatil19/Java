import java.util.*;
public class funcstr {
    public void change(String s){
        s.trim();
        int n=s.length();
        s=" "+s;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==' '){
                System.out.println(s.charAt(i+1));
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
        funcstr ob=new funcstr();
        ob.change(s);

    }
}
