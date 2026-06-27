//https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/PRACTICEPERF
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input =new Scanner (System.in);
	    int count = 0;
	    for(int i=0; i<4; i++) {
	        int p = input.nextInt();
	        if( p >= 10) {
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}
