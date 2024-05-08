import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0){
		int N=sc.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++){
		    a[i]=sc.nextInt();
		}
		int ans=0;
		for(int i=0;i<N;i++){
		    if(ans<a[i]){
		        ans=a[i];
		    }
		}
		System.out.println(ans);
		T--;
}
	}
}
