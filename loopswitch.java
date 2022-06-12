import java.util.*;
public class loopswitch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice ");
        int t=sc.nextInt();
        switch(t){
            case 1:
            int n=sc.nextInt();
            int f=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    f++;
                }
            }
            if(f==2){
                System.out.println("it is a prime number");

            }
            else{
                System.out.println("not a prime number");
            }
            break;
            case 2:
            int a=sc.nextInt();
            int count=0;
            int sq=a*a;
            int l=a;
            int r;
            while(a>0){
                a=a/10;
                count++;
            }
            r=sq% (int)Math.pow(10,count);
            if(l==r)
            System.out.println("it is an automorphic number");
            else
            System.out.println("Not a automorphic number");
            break;
              }
        sc.close();
    }
    
}
