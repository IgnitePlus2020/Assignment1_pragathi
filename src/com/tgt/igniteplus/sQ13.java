//a program to print sequence 1,4,27,256,3125.......N
package com.tgt.igniteplus;
import java.util.Scanner;
import static java.lang.Math.pow;
public class sQ13 {
    public static void main(String[] args){
        int n;
        System.out.print("enter the number of terms: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i++)
                System.out.print((int)pow(i,i)+" ");
    }
}
