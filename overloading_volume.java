import java.util.Scanner;

public class overloading_volume {
    public double volume(int s){
        double vol=s*s*s;
        return vol;
    }
    public double volume(double r){
        double vol=4/3*3.14*r*r*r;
        return vol;
    }
    public double volume(int l,int b,int h){
        double vol=l*b*h;
        return vol;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        double r=sc.nextDouble();
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        overloading_volume a=new overloading_volume();
        System.out.println(a.volume(r));
        System.out.println(a.volume(s));
        System.out.println(a.volume(l,b,h));
        sc.close();
    }
}
