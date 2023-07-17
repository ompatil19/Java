import java.util.Scanner;

public class distance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l,m,o;
        int n=sc.nextInt();
        int q=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        int[] a=new int[q];
        int[] b=new int[q];
        for (int k=0;k<q;k++){
             l=sc.nextInt();
             m=sc.nextInt();
             o=sc.nextInt();
             a[k]=Math.abs((l-m));
             b[k]=o;
        }

        sc.close();
    }
    
}
