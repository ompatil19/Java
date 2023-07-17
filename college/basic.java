import java.util.*;
import java.io.*;
class basic{
    int add(int a,int b){
        return a+b;
    }
    int add(int a){
        return a+1;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("The number of eleements are "+n);
        sc.close();
        basic obj=new basic();
        // obj.add(n);
        System.out.println("The sum is "+obj.add(n));
        System.out.println("The sum is "+obj.add(n,5));

    }
}