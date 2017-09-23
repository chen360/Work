package work;

import java.util.Scanner;


public class Matrix
{

	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("please write a number between 4 to 10:");
		n=s.nextInt();
		
		if(4<=n&&n<=10)
		  caculate(n);
		else
		  System.out.println("please write a right number!");
	}
	
	public static void caculate( int n)

	{
		int i,j;
		int k=0;
		int [][] a=new int[n][n];
		
		
		for( i=0;i<n;i++)
			for(j=0;j<n;j++)
			{
				for(;i<n;i++)
				{
					a[i][j]=++k;
				}
				for(i=n-1;j<n;j++)
				{
					a[i][j]=++k;
				}
				for(j=n-1;i>=0;i--)
				{
					a[i][j]=++k;
				}
				for(;j>=0;j--)
				{
					a[i][j]=++k;
				}
				if(a[i][j]==n*n)
					break;
       
			}	
			for(i=0;i<n;i++)
			{
				System.out.println("/n");
				for(j=0;j<n;j++)
				{
					System.out.println(a[i][j]);
				}
		
			}
			
	  }
}
