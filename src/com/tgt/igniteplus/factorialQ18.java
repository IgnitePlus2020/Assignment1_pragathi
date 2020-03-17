//a program to calculate a factorial of a given number
package com.tgt.igniteplus;
import java.util.Scanner;
public class factorialQ18 {
    public static void main(String[] args){
        int n,fact=1;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number whose factorial is to be calculated  ");
        n=in.nextInt();
        for(int i=n;i>0;i--)
            fact=fact*i;
        System.out.print("the factorial of "+n+"="+fact);
    }
}
