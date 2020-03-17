//a program to separate integer and decimal part
package com.tgt.igniteplus;
import java.util.*;
public class wholefrac6 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double num,whole_part,fraction_part;
        System.out.print("enter the decimal number");
        num=in.nextDouble();
        fraction_part=num%1;
        whole_part=num-fraction_part;
        System.out.println("integer part"+whole_part);
        System.out.print("fraction part"+fraction_part);
    }
}
