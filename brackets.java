import java.util.Scanner;

public class brackets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int round=0,flower=0,square=0,sol=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(')
                round++;
            else if( ch==')')
                round--;
            else if(ch=='{')
                flower++;
            else if(ch=='}')
                flower--;
            else if(ch=='[')
                square++;
            else if(ch==']')
                square--;
        }
         if(round%2==0 && flower%2==0 && square%2==0){
            System.out.println("true");
        }
        else{
        sol=Math.abs(round)+Math.abs(flower)+Math.abs(square);
        System.out.println(sol);
        }

        sc.close();
    }
    
}
