package com.ch3;
// a simple demonstration of local variable type inference.

public class VarDemo {

    public static void main(String[] args) {
        //Use type inference to determine the type of the  variable named avg. In this case , double id inferred.
        var avg = 10.0;
        System.out.println("value of avg:" + avg);
        //in the following context, var is not predefined identifier. It is simple  a user defined variable name.
        int var = 1;
        System.out.println("value of var " + var);

        //interestingly,in the following sequence,vat is used as both the type of the declaration and as a variable name in the initializer.
        var k = -var;
        System.out.println("value of k: " + k);


        var myArray = new int[8];
//        var[] myArray = new int[8]; this is wrong
//        var myArray = { 1, 2, 3 }; // Wrong
// var counter;  Wrong! Initializer required
    }

}
