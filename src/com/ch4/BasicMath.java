package com.ch4;

// Demonstrate //arithmetic Operator and modulus Operator
public class BasicMath {
    public static void main(String[] args) {
        //arithmetic using integers
        System.out.println("Integer Arithmetic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + d);

        //arithmetic using double
        System.out.println("\nFloating Point Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);

        //modulus Operator
        System.out.println("\nModulus Operator");
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 " + x % 10); // x %= 10;
        System.out.println("y mod 10 " + y % 10); // y %= 10;
    }
}
