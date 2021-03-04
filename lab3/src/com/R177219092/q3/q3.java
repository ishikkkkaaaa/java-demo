//Write a program to input a number of a month (1 - 12) and print its equivalent name of the month.
package com.R177219092.q3;
import java.util.*;
public class q3 {
	public static void main(String args[])
	{
		System.out.println("Enter the month number!!");
		Scanner sc= new Scanner(System.in);
		int date;
		String month[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        date=sc.nextInt();

        System.out.println("The month is=>"+" "+month[date-1]);
	}

}
