    /* package codechef; // don't place package name! */

    import java.util.*;
    import java.lang.*;
    import java.io.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class om1
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- >0){
                long mon;
                int n=sc.nextInt();
                int k=sc.nextInt();
                	String s = sc.next();
		int count=0,lan=0;
		for (int i=0;i<n;i++){
		    if (s.charAt(i)=='0'){
		        count++;
		        if (cnt==k){
		            lan++;
		            count=0;
		        } 
		    }
		    else {
		        count=0;
		    }
		} 
		System.out.println(lan);
		}

        }
    }
