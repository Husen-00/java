// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/SUMM
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for (int i=0; i<t; i++) {
	        int a, b, c;
	        a = input.nextInt();
	        b = input.nextInt();
	        c = input.nextInt();
	        if (a+b == c) {
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	    }
	}
}
