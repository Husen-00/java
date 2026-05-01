// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/CHAIRS_
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
	        int x, y;
	        x = input.nextInt();
	        y = input.nextInt();
	        if (y >= x) {
	            System.out.println(0);
	        }
	        else {
	        System.out.println(x-y);
	        }
	    }
	}
}
