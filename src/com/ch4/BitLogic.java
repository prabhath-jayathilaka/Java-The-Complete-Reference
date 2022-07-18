package com.ch4;

public class BitLogic {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

//        Integer.toBinaryString(5); a method to convert integer to binary string
        System.out.println("a = " + a + "  " + Integer.toBinaryString(a));
        System.out.println("b = " + b + "  " + Integer.toBinaryString(b));
        System.out.println("a | b = " + c + "  " + Integer.toBinaryString(c));
        System.out.println("a & b = " + d + "  " + Integer.toBinaryString(d));
        System.out.println("a ^ b = " + e + "  " + Integer.toBinaryString(e));
        System.out.println("(~a & b) | (a & ~b) = " + f + "  " + Integer.toBinaryString(f));
        System.out.println("~a & 0x0f = " + g + "  " + Integer.toBinaryString(g));
    }
}
