//a program to convert decimal number to its binary equivalent
package com.tgt.igniteplus;
import java.util.Scanner;
public class dec2bin19{
    public static void main(String[] args){
        int n;
        System.out.print("enter the number in decimal: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] bin=new int[100];
        int i=0;
        while(n > 0){
            bin[i]=n%2;
            n=n/2;
            i++;
        }
        System.out.print("the equivalent binary number is ");
        for(int j=i-1;j>=0;j--)
            System.out.print(bin[j]);
    }
}
