import java.util.* ;
import java.io.*; 
public class Solution {
public int findMaxF(int[] arr) {
  int maxF = 0;
  for (int x : arr) {
    int s = 0;
    int g = 0;
    for (int value : arr) {
      if (value < x) {
        s++;
      } else if (value > x) {
        g++;
      }
    }
    int f = s + g;
    if (f > maxF) {
      maxF = f;
    }
  }
  return maxF;
}
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-- >0){
        int n=sc.nextInt();
    int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    int ans=findMaxF(a[]);
    System.out.println(ans);
}
}
