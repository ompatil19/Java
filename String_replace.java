import java.util.Scanner;

public class String_replace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String str=st.replace('e','*');
        System.out.println(str);
        sc.close();
    }
}
