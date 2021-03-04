//Write a Java Program to accept 10 numbers in an array and compute the square of each number.
//Print the sum of these numbers.

package com.R177219092.q2;
import java.util.*;
public class q2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[10];
		System.out.println("Enter 10 number!!");
		{
			for(int i=0; i<10;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("The squares are=>");
			{
				for(int i=0; i<10;i++)
				{
					System.out.println(a[i]*a[i]);
				}
				
			}
		}
		int sum=0;
        for(int i=0;i<10;i++) {
            sum+=(a[i]*a[i]);
        }
        System.out.println("Sum the numbers is : \t"+sum);
	}

}
