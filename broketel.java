import java.util.*;
public class broketel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n;
        while(k>0){
            int f=0;
            n=sc.nextInt();
            int [] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
                if(a[1]!=a[0])
                f++;
                if(a[n-1]!=a[n-2])
                f++;
            for(int j=0;j<n;j++){
                if(j>=1 && j<=n-2){
                    if((a[j-1]!=a[j]) || (a[j]!=a[j+1])){
                        f++;
                    }
                }
            }
            k--;
            System.out.println(f);
        }
    }
}
