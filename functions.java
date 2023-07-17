import java.util.Scanner;

public class functions {
     public static double factorial(int n){
        double fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    functions s=new functions();
    System.out.println(factorial(n));
    sc.close();
    
}
}