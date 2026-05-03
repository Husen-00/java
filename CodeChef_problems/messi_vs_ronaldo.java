// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/MVR
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int a, b, x, y;
	    a = input.nextInt();
	    b = input.nextInt();
	    x = input.nextInt();
	    y = input.nextInt();
	    if ((2*a + b) > (2*x + y)) {
	        System.out.println("MESSI");
	    }
	    else if ((2*a + b) < (2*x + y)) {
	        System.out.println("RONALDO");
	    }
	    else {
	        System.out.println("EQUAL");
	    }
	}
}
