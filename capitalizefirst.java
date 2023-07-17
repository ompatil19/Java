import java.util.Scanner;

public class capitalizefirst {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="",s2;
        s=" "+s;
        s2=s.toLowerCase();
        int n=s2.length();
        System.out.println(s2);
        for (int i=0;i<n;i++){
            char ch=s2.charAt(i);
            if(ch==' '){
                char ch1=s2.charAt(i+1);
                ch1=Character.toUpperCase(ch1);
                s1=s1+" "+ch1;
                i+=1;
            }
            else{
                s1=s1+ch;
            }

        }
        System.out.println(s1);
        sc.close();
    }    
}
