//https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/POPULATION
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
	        int x, y, z;
	        x = input.nextInt();
	        y = input.nextInt();
	        z = input.nextInt();
	        System.out.println(x-y+z);
	    }
	}
}
