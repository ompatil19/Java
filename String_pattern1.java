import java.util.*;
public class String_pattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word you want to ptint");
        String s=sc.nextLine();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            for(int j=n;j>=i+1;j--){
                System.out.print(" ");
            }
            System.out.println(s.substring(0,i+1));
            sc.close();
        }
    }
}