import java.util.*;
public class greatestnumber {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a,b,c,max,min,mid,maxnum,minnum;
    System.out.println("Enter the three numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b && a>c){
        max=a;
        if(b>c){
            mid=b;
            min=c;
        }
        else {
            mid=c;
            min=b;
        }
    }
    if(b>a && b>c){
        max=b;
        if(a>c){
            mid=a;
            min=c;
        }
        else {
            mid=c;
            min=a;
        }
        }
        else{
            max=c;
            if(a>b){
                mid=a;
                min=b;
            }
            else{
                mid=b;
                min=a;
            }
        }
    System.out.println("max="+max+"\nmin="+min+"\nmid="+mid+"\n");
    maxnum=(max*100)+(mid*10)+min;
    minnum=(min*100)+(mid*10)+max;
    System.out.println("Maximum number ="+maxnum+"\n Minimum number="+minnum);
    sc.close();
}
}