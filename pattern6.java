public class pattern6 {
    public static void main(String[] args){
        int k,a=8,c=2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || i==j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(k=a;k>0;k--){
                System.out.print(" ");
            }
            a-=2;
            for(int l=1;l<=i;l++){
                if(l==1 || i==l)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }   
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                if(j==5 || i==j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            if(i>=2){
            for(k=c;k>0;k--){
                System.out.print(" ");
            }
            c+=2;
        }
            for(int l=5;l>=i;l--){
                if(l==5 || i==l)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }   
     }
    
}
