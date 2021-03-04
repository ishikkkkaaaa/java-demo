//Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5.
package com.R177219092.q4;
import java.util.*;
public class q4 {
    public static void main(String args[]) {
        int sum=0;
        for(int i=40;i<250;i++){
            if(i%5==0)
            sum+=i;
        }
        System.out.println("SUM => "+sum);
    }

}
