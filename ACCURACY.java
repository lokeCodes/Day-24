// https://www.codechef.com/problems/ACCURACY
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int y = x;
            while( x%3 != 0){
                x++;
            }
            System.out.println(x-y);
		}
	}
}
