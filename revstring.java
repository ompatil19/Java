import java.util.*;
public class revstring {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k>0){
        int pow=0;
        String s=sc.next();
        int n=s.length();
        char [] ch= s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<n;i++){
        pow+=((i+1)*(((int)ch[i])-96));
        }
        System.out.println(pow);
        k--;
        }
}
}
