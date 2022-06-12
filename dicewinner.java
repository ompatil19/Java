import java.util.*;
public class dicewinner {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int sum=0,sum1=0,a=1,b=1;
    while (true){
        int n=(int)((Math.random()*5)+1);
        sum+=n;
        a++;
        if(sum>=20)
        break;
    }
    while(true){
        int n1=(int)((Math.random()*5)+1);
        sum1+=n1;
        b++;
        if(sum1>=20)
        break;
    }
    System.out.println(a);
    System.out.println(b);
    sc.close();
}
}