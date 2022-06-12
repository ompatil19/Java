import java.util.*;
public class hotel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int days,t=0;
        String cat;
        double price=0.0,disc=0.5;
        System.out.println("enter the category");
        cat=sc.nextLine();
        System.out.println("enter the number of days");
        days=sc.nextInt();
        if(days<3){
        disc=0.1;
        }
        else if(days>=3 && days<5){
        disc=0.15;
        }
        else if(days>=5 && days<10){
        disc=0.2;
        }
        else if(days>10){
        disc=0.3;
        }
        if(cat.equalsIgnoreCase("S")){
            t=2500;
        }
        else if(cat=="D"){
            t=3500;
        }
        else if(cat=="F"){
            t=5000;
        }
        else {
            System.out.println("wrong choice");

        }
        price=t*days;
        price-=(price*disc);
        System.out.println("price to be paid is"+price);
        sc.close();
    }
}
