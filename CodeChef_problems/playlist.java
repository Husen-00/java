// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/SONGS
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int t= input.nextInt();
	    for(int i=0; i<t; i++) {
	        int n, x;
	         n = input.nextInt();
	         x = input.nextInt();
	         System.out.println(n/(x*3));
	    }
	    input.close();
	}
}
