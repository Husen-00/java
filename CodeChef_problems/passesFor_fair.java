// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/FAIRPASS
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner (System.in);
	    int t = input.nextInt();
	    for (int i=0; i<t; i++) {
	        int n, k;
	        n = input.nextInt();
	        k = input.nextInt();
	        if(k>=n+1) {
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	    }
	}
}
