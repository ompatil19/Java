import java.util.*;
public class recurs_fibo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,n-1);
    }
    public static void fibo(int a,int b,int n){
        int c;
        if(n==1){
            return;
        }
        c=a+b;
        System.out.println(c);
        fibo(b,c,n-1);

    }
    
}
