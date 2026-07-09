// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/DOMINANT
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int t  = input.nextInt();
	    for(int i=0; i<t; i++) {
	        int na = input.nextInt();
	        int nb = input.nextInt();
	        int nc = input.nextInt();
	        if(na > nb+nc || nb > na+nc || nc>na+nb) {
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	    }
	}
}
