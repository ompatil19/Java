import java.util.*;
class average {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);        
        int sum=0,a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float avg=0.0F;
        sum=a+b+c;
        avg=sum/3;
        System.out.println("average is "+avg);
        sc.close();
    }
}