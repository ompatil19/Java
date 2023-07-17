import java.util.Scanner;
public class reversing_number_using_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int l=s.length();
        for(int i=l-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        sc.close();
        }
    
}
