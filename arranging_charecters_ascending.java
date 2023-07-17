import java.util.Scanner;

public class arranging_charecters_ascending {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] a= new char[5];
        String s=sc.nextLine();
        for(int i=0;i<5;i++){
            a[i]=s.charAt(i);
        }
        for(int i=0;i<4;i++){
            for(int j=(i+1);j<5;j++){
                if(a[i]>a[j]){
                    char t =a[i];
                    a[i]=a[j];
                    a[j]=t;

                } 
            }
        }
        System.out.println("The letter arranged in ascending order are:");
        for(int k=0;k<5;k++){
            System.out.print(a[k]);
        }
        sc.close();
    } 
}
 