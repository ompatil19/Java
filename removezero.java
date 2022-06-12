import java.util.*;
public class removezero {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n,c=0,t;
        while(r>0){
            r=r/10;
            c++;
        }
        while(c>0){
            t=n%10;
            n=n/10;
            if(t==0){
                continue;
            }
            System.out.print(t);
            c--;
        }
        sc.close();

    }
}
