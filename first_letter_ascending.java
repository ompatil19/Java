import java.util.Scanner;

public class first_letter_ascending {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String temp,s="";
        String [] a=new String[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextLine();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4-i;j++){
                if((a[j].compareTo(a[j+1]))>0){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int k=0;k<5;k++){
            s=s+a[k].charAt(0);
        }
        System.out.println(s);
        sc.close();
    }
    
}
