/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class try2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int []a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		        int sum=0,product=1;
		        for(int j=i;j<n;j++)
		        {
		            sum+=a[j];
		            product*=a[j];
		            if(sum==product){           
                                 System.out.println(sum);
                                 c++;
                    }

		        }
		    }
		    System.out.println(c);
		}
	}
}
