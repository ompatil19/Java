import java.util.Scanner;

public class number_function {
    public void number(int n,int num){
        int r;
        int deci_num=0;
       switch(n){
        case 1:
        while(num>0){
            r=num%2;
            num=num/2;
            System.out.print(r);
        }
        break;
        case 2:
        int i=0;
        while(num>0){
            r=num%10;
            num=num/10;
            deci_num+=r*((int)(Math.pow(2,i)));
            i++;
        }
        System.out.println(deci_num);
        break;
       } 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        number_function s=new number_function();
        s.number(n,num);
        sc.close();

    }
    
}
