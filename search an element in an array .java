import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a=new Scanner(System.in);
		int N=a.nextInt();
		int X=a.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
		    A[i]=a.nextInt();
		}
		int flag=0;
		for(int i=0;i<N;i++){
		    if(X==A[i])
		    flag=1;
		}
		if(flag==1){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}
