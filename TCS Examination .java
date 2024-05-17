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
             int DSA=sc.nextInt();
             int TOC=sc.nextInt();
             int DM=sc.nextInt();
             int dsa=sc.nextInt();
             int toc=sc.nextInt();
             int dm=sc.nextInt();
             if(DSA+TOC+DM > dsa+toc+dm){
                 System.out.println("dragon");
             }
             else if(DSA+TOC+DM < dsa+toc+dm){
            System.out.println("sloth");

             }
             else{
                 if(DSA >dsa){
                                      System.out.println("dragon");

                 }
                 else if(DSA <dsa){
                                      System.out.println("sloth");

                 }
                 else{
                 if(TOC>toc){
                                      System.out.println("dragon");

                 }
                 else if(TOC <toc){
                                      System.out.println("sloth");

                 }
                 else{
                 if(DM >dm){
                                      System.out.println("dragon");

                 }
                 else if(DM<dm){
                                      System.out.println("sloth");

                 }
                 else{
                     System.out.println("tie");
                 }
             }
         }
	}
}
}
}
