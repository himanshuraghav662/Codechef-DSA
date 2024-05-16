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
		    int x=sc.nextInt();
		    int ans=0;
		    if(n%6==0){
		        ans=(n/6)*x;
		    }
		    else{
		        ans=((n/6)+1)*x;
		    }
		    System.out.println(ans);
		}

	}
}
