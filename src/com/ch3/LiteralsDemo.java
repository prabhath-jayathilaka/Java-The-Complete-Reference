package com.ch3;

public class LiteralsDemo {
    public static void main(String[] args) {
        int _decimal =20; //decimal
        int _octal= 020; //octal
        int __octal= 070; // octal are in range 0-7
        int _hexadecimal= 0x20; //hexadecimal
        int _binary =0b1010;//binary
        long _long=536L;



        int x= 0b1010;

//        more readable format of integer
        int _x= 123_456_789;
        int __x= 123__456__789;
        int bx = 0b1101_0101_0001_1010;

        System.out.println("x :"+x);
        System.out.println("_x :"+_x);
        System.out.println("__x :"+__x);
        System.out.println("bx :"+bx);


        double num_double = 9_423_497_862.0;
        double _num_double = 9_423_497_862.0;

        System.out.println("num_double :"+num_double);
        System.out.println("_num_double :"+_num_double);

//        byte newyork = 0b00100001;
//        short chicago = 0b101000010100;
//        int a1 = 0b10110;
//        int a2 = 0b101;
//        int a3 = 0b1011;
//        int a4 = 0b1010110101;
//
//        int al=a2+a3;
//
//        System.out.println("Byte value " +newyork);
//        System.out.println("Short "+chicago);
//        System.out.println("Integer "+a1);
//        System.out.println("Result "+al);
//        System.out.println("Value a4 "+a4);

    }
}
