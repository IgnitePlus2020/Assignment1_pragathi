//a program to separate integer and decimal part.
package com.tgt.igniteplus;
import java.util.*;
public class wholefracQ6 {
    public static void main(String[] args){
        double n, temp = 0.0, whole = 0, frac = 0;
        int i = 1;
        System.out.println("Enter the value of n:");
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();
        do {
            i = i * 10;
            temp = n * i;
        } while ((temp % 10) != 0);
        i = i / 10;
        temp = (int) n;
        frac = (n * i) - (temp * i);
        System.out.println("Actual value: " + n);
        System.out.println("Whole part: " + (int) n + "\nFraction part: " + (int) frac);
    }
}
