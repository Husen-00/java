// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/SUBSCRIBE
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner h = new Scanner (System.in);
	    int t = h.nextInt();
	    for (int i=0; i<t; i++) {
	        int x = h.nextInt();
	        if(x<=30) {
	            System.out.println("NO");
	        }
	        else {
	            System.out.println("YES");
	        }
	    }
	}
}
