import java.util.*;
public class recurs_reverse_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        rev_str(n-1, str);
    }
    public static void rev_str(int idx, String str){
        if(idx==0){
           System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        rev_str(idx-1, str);
    }

}
