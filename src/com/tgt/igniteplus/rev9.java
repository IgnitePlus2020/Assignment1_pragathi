//a program to reverse a given number
package com.tgt.igniteplus;
import java.util.Scanner;
public class rev9 {
    public static void main(String[] args){
        int num,rev=0;
        System.out.print("enter the number to be reversed: ");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        while (num != 0) {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.print("reversed number= "+rev);
    }
}
