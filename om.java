/* package codechef; // don't place package name! */

import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.lang.*;
import java.net.SocketTimeoutException;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class om {
public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            long max=0,nmax=0;
            long a[][]=new long[n][2];
            for(int i=0;i<n;i++){
                for(int j=0;j<2;j++){
                    a[i][j]=sc.nextLong();
                    if(a[i][0]>max)
                    max=i;
                }
            }
            columnWiseSorting(a, 1);
            for(int i = 0; i< a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                  System.out.print(a[i][j] + " ");
              }
                 System.out.println();
          }
            // for(int i=0;i<n;i++){
            //     if(a[i][0]<max && a[i][0]>nmax)
            //     nmax=i;
            // }
            // System.out.println(max);
            // System.out.println(nmax);
        }
    }
static void columnWiseSorting(long arr[][], int colmn) {
    Arrays.sort(arr, new Comparator<int[]>() {
                public int compare(long[] frst, long[] scnd) {
                      if(frst[colmn-1] > scnd[colmn-1]) {
                             return 1;
                       }
                      else return -1;
                       }
                      });
}
}