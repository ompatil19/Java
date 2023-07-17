import java.util.Scanner;

public class double_letter {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int f=0;
        int l=s.length();
        for(int i=0;i<l-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                f++;
            }
        }
        System.out.println(f);
    }    
}
