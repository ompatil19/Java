import java.util.Scanner;

public class surname {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st,sn,st1="",st2="";
        int i,p;
        char chr;
        st=sc.nextLine();
        st=' '+st;
        p=st.lastIndexOf(' ');
        sn=st.substring(p);
        for(i=0;i<p;i++){
            chr=st.charAt(i);
            if(chr==' ')
            st1=st1+st.charAt(i+1)+'.';
        }
        st2=st1+sn;
        System.out.println(st2);
        sc.close();
    }
}