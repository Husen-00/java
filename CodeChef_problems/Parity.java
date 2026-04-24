// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/PAR2
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
	        int n = input.nextInt();
	        if(n/2 + n/2 == n) {
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	    }
	}
}
