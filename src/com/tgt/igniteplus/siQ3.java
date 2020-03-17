//a program to calculate simple interest.
package com.tgt.igniteplus;
import java.util.*;
public class siQ3 {
    public static void main(String[] args){
        float p,r,t,si;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = in.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = in.nextFloat();
        System.out.print("Enter the Time period : ");
        t = in.nextFloat();
        si = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +si);
    }
}
