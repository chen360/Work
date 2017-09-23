package work;

import java.util.*;
public class dizeng
 {
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("please write a number:");
		n=s.nextInt();
		count(n);
	}
	
	public static void count(int n)
	{
        System.out.println(n);//输出n*=2;的值
		if(n<5000)
		{
			n*=2;
			count(n);
			n/=2;
		}
		
		System.out.println(n);//输出n/=2;的值
		
	}
 }