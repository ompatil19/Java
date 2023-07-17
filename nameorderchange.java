import java.util.Scanner;

public class nameorderchange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String s=sc.nextLine();
        String s1="",s2="",str="";
        int last=s.lastIndexOf(' ');
        s1=s.substring(last);
        s2=s.substring(0,last+1);
        str=s1+" "+s2;
        System.out.println(str);
        sc.close();
    }
}
