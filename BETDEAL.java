// https://www.codechef.com/problems/BETDEAL
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
		    int y = s.nextInt();
		    int dis = y*2;
		    int res1 = 100-x;
		    int res2 = 200-dis;
		    if(res1<res2){
		        System.out.println("FIRST");
		    }else if(res1==res2){
		        System.out.println("BOTH");
		    }else{
		        System.out.println("SECOND");
		    }
		}
	}
}
