package com.ch4;

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int _a;

        _a = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a : " + a + " Binary " + Integer.toBinaryString(a));
        System.out.println("Left Shift value of a : " + _a + " Binary " + Integer.toBinaryString(_a));
        System.out.println("Left Shift value of a : " + b + " Binary " + Integer.toBinaryString(b));

//        Original value of a : 64 Binary 1000000
//        Left Shift value of a : 256 Binary 100000000
//        Left Shift value of a : 0 Binary 0


        System.out.println();
        int x = 8;
        int _x = x << 2;
        System.out.println("Original value of a : " + x + " Binary " + Integer.toBinaryString(x));
        System.out.println("Left Shift value of a : " + _x + " Binary " + Integer.toBinaryString(_x));

//        Original value of a : 8 Binary 1000
//        Left Shift value of a : 32 Binary 100000

        System.out.println();
        int y = 32;
        int _y = y >> 2;
        System.out.println("Original value of a : " + y + " Binary " + Integer.toBinaryString(y));
        System.out.println("Right Shift value of a : " + _y + " Binary " + Integer.toBinaryString(_y));

//        Original value of a : 32 Binary 100000
//        Right Shift value of a : 8 Binary 1000
    }
}
