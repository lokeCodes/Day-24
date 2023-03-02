// https://www.codechef.com/problems/MAKEAP
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
            int a = s.nextInt();
            int c = s.nextInt();
            int b = (a+c)/2;
            
            int res1 = b-a;
            int res2 = c-b;
            int res3 = (res1== res2 || res2==res1) ? b : -1;
            System.out.println(res3);
            
            // int res = ((a+c)%2==0) ? b : -1;
            // System.out.println(res);
            
            // if( (a+c)%2==0 ){
            //     System.out.println(b);
            // }else{
            //     System.out.println(-1);
            // }
            
        }
	}
}
