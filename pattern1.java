public class pattern1 {
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            int n=1,l=1;
            n=n+(i*2);
            for(int j=5;j>i;j--){
                System.out.print(n);
                n+=2;
            
            }
            for(int k=1;k<=i;k++){
                System.out.print(l);
                l+=2;
            }
            System.out.println();
        }
    }
}
