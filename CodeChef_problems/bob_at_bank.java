//https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/BOBBANK
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for (int i =0; i<t; i++) {
	        int w = input.nextInt();
	        int x = input.nextInt();
	        int y = input.nextInt();
	        int z = input.nextInt();
	        System.out.println(w+(z*(x-y)));
	    }
	}
}
