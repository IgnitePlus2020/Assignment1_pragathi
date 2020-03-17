//a program to print if an entered number is even or odd.
package com.tgt.igniteplus;
import java.util.*;
public class oddevenQ5 {
    public static void main(String[] args){
       int num;
       Scanner in=new Scanner(System.in);
       System.out.print("enter the number to be checked");
       num=in.nextInt();
       if(num%2==0)
           System.out.print("EVEN");
       else
           System.out.print("ODD");
    }
}
