// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/PARTY2
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      Scanner input = new Scanner (System.in);
	      int t =input.nextInt();
	      for (int i=0; i<t; i++) {
	          int n, x, k;
	          n = input.nextInt();
	          x = input.nextInt();
	          k = input.nextInt();
	          if (k >= n*x) {
	              System.out.println("YES");
	          }
	          else {
	              System.out.println("NO");
	          }
	      }
	}
}
