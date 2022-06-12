import java.util.*;
public class checkfibonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int n1=5*(n*n)+4;
        int n2=5*(n*n)-4;
        double d1=Math.sqrt(n1);
        double d2=Math.sqrt(n2);
        if(d1-Math.floor(d1)==0 || d2-Math.floor(d2)==0){
            System.out.println("The number is present in fibonacii series");
        }
        else{
            System.out.println("The number is not present in fibonacii series");
        }
        sc.close();
    }
}
