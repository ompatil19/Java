import java.util.*;
public class circularprime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=0,r;
        int n=sc.nextInt();
        for(int i=1;i<=3;i++){
                r=n%100;
                n=n/100;
                n1=r*10+n;
            System.out.println(n1);
            n=n1;
        }
        sc.close();
    }
}
