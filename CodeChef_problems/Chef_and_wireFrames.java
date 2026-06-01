// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/CWIREFRAME
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
	        int n, m, x;
	        n = input.nextInt();
	        m = input.nextInt();
	        x = input.nextInt();
	        System.out.println(((2*n)+(2*m))*x);
	    }
	}
}
