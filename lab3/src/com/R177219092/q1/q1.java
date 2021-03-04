//Write a program to accept three digits (i.e. 0 - 9)
//and print all its possible combinations.

package com.R177219092.q1;

import java.util.*;
public class q1 {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("Enter the 3 digits!!");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
			}
		}
	}

}
