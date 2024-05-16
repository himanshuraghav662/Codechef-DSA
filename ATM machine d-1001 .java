import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0){
          int n=sc.nextInt();
          int k=sc.nextInt();
          int[] arr=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
          }
          StringBuffer str = null;
          str = new StringBuffer();
          for(int i=0;i<n;i++){
              if(arr[i]<=k){
                  str.append("1");
                  k-=arr[i];
              }
              else{
                  str.append("0");
              }
          }
          System.out.println(str);
      }
	}
}
